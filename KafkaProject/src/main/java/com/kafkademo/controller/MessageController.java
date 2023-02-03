package com.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkademo.kafka.KafkaProducer;

@RestController
public class MessageController {

	@Autowired
	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}

	
	///http:localhost:8080/send?message= bhuva
	@GetMapping("/send")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaProducer.sendmessage(message);
		return ResponseEntity.ok("message sent to the topic..");

	}
	
		
}
