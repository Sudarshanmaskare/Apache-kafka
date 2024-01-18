package com.deliveryboy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.appConstants;

import ch.qos.logback.classic.Logger;

@Service
public class kakfaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger = (Logger) LoggerFactory.getLogger(kakfaService.class);

    public boolean updateLocation(String location) {

        this.kafkaTemplate.send(appConstants.LOCATION_TOPIC_NAME, location);
        this.logger.info("message produced ");
        System.out.println("--------------------------------------------------------------------");

        return true;
    }
}
