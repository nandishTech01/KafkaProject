package com.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	@Autowired
	private KafkaTemplate<String , String> kafkatemplete;

	//now create the constructor using source
	public KafkaProducer(KafkaTemplate<String, String> kafkatemplete) {
		super();
		this.kafkatemplete = kafkatemplete;
	}
	
	public void sendmessage(String message) {
		
		LOGGER.info(String.format("message sent %s", message));
		kafkatemplete.send("nandishTech",message); //it will use for the send topic name
	}
	
	
	
}
