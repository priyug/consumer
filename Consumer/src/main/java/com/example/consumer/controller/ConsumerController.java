package com.example.consumer.controller;
import com.example.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/kafka")
    public class ConsumerController {

        @Autowired
        private ConsumerService service;

        @GetMapping("/message")
        public ResponseEntity<String> getMessage() {

            return ResponseEntity.ok(service.getMessage());
        }
    }

