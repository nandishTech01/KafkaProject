package com.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkademo.Payload.UserKafka;

@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(groupId = "myGroup",topics = "nandishTechJson")
	public void consume(UserKafka userKafka) {
		
		LOGGER.info(String.format("Json Data received -> %s",userKafka.toString() ));
		//userKafka.toString()  is needed..
	}

}
