package com.batriver.intgr.timer.service.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.quartz.QuartzComponent;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TimerServiceRoute extends RouteBuilder {
	
	@Value("${camel.springboot.name}")
    String appName;

    @Autowired
    ApplicationContext applicationContext;

	@Override
	public void configure() throws Exception {

		// generates an event/constant message every 5 seconds
		from("custom-quartz:QuartzScheduler/clusteredScheduler?cron=0/5+*+*+*+*+?").id("quartz-timer")
			.transform().constant("Hello Message from quartz")
			.log(LoggingLevel.INFO,"${body}");

	}
	
	@Bean("custom-quartz")
    public QuartzComponent customQuartz() {
        QuartzComponent quartzComponent = new QuartzComponent();
        quartzComponent.setScheduler((Scheduler) applicationContext.getBean("quartzScheduler"));

        return quartzComponent;
    }

}