package com.enduser.enduser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConfig {

    @KafkaListener(topics = appConstants.LOCATION_UPDATE_TOPIC, groupId = appConstants.GROUP_ID)
    public void updatedLocation(String value) {

        System.out.println(value);
    }
}
