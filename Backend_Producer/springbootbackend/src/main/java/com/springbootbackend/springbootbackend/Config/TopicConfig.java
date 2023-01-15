package com.springbootbackend.springbootbackend.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    /**
     * This method is used for creating a bean of NewTopic with the name set from application properties.
     */
    @Bean
    public NewTopic MyTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }
}
