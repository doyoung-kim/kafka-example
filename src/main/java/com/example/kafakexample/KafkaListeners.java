package com.example.kafakexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "doyoungcode",
            groupId = "groupId"
    )

    void listener(String data) {
        System.out.println("Listener received : " + data + " 짝~");
    }
}
