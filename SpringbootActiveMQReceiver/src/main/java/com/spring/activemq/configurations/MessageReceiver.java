package com.spring.activemq.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.spring.activemq.models.Message;

@Component
public class MessageReceiver {
    private final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);
    
    @JmsListener(destination = "message")
    public void listener(Message message){
        logger.info("Message received {} ", message);
        logger.info("ID: {}, Message: {} ", message.getId(),message.getMessage());
    }
}
