package com.spring.activemq.configurations;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfig {
	
	@Value("${queue.name}")
	private String queuename;
	
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue(queuename);
	}
}
