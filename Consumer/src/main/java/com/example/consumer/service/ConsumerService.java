package com.example.consumer.service;

import com.example.consumer.model.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private String message = "";

    @KafkaListener(topics = "priyu", groupId = "consumer-group")
    public void consume(Course course) {

        message = course.toString();

        System.out.println("Received : " + course);
    }

    public String getMessage() {
        return message;
    }
}


