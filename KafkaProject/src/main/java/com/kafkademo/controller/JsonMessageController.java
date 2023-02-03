package com.kafkademo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kafkademo.Payload.UserKafka;
import com.kafkademo.kafka.JsonKafkaProducer;

@RestController
public class JsonMessageController {

	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		super();
		this.jsonKafkaProducer = jsonKafkaProducer;
	}

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody UserKafka userKafka) {
		jsonKafkaProducer.sendmessage(userKafka);

		return ResponseEntity.ok(" json message sent successfully..");
	}
}
