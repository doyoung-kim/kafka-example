package com.example.kafakexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.kafka.config.TopicBuilder;

@Configurable
public class KafaTopicConfig {

    public NewTopic doyoungcodeTopic() {
        return TopicBuilder.name("doyoungcode")
                .build();
    }
}
