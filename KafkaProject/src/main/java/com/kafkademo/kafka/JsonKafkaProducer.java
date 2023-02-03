package com.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafkademo.Payload.UserKafka;

@Service
public class JsonKafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String,UserKafka> kafkaTemplate;
	
	//now we have to create one constructure
	
	public JsonKafkaProducer(KafkaTemplate<String, UserKafka> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendmessage(UserKafka data) {
		
		LOGGER.info(String.format("message send -> %s",data.toString()));
		
		Message<UserKafka> message = MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "nandishTechJson") //(topic , value of the topuic)	
				.build();
		
		kafkaTemplate.send(message);
	}
}
