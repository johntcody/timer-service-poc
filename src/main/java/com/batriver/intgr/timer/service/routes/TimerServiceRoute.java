package com.batriver.intgr.timer.service.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TimerServiceRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// generates an event/constant message every 5 seconds
		from("quartz://TestTimerName?job.name=demoQuartzCluster&cron=0/5+*+*+*+*+?").id("quartz-timer")
			.transform().constant("Hello Message from quartz")
			.log(LoggingLevel.INFO,"${body}");

	}

}