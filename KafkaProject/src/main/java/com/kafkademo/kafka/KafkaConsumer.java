package com.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(groupId = "myGroup",topics = "nandishTech")
	public void consume(String message) {
		LOGGER.info(String.format("message received -> %s", message));
	}
}
