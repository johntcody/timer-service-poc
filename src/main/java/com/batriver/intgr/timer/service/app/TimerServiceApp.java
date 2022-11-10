package com.batriver.intgr.timer.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com.batriver.intgr"} )
public class TimerServiceApp {
    public static void main( String[] args ) {
    	SpringApplication.run(TimerServiceApp.class, args);
    }
}
