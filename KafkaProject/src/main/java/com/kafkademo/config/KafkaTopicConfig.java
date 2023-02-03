package com.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic nandishTech() {
		return TopicBuilder.name("nandishTech").build();

	}
	
	@Bean
	public NewTopic nandishTech1() {
		return TopicBuilder.name("nandishTechJson").build();

	}
}
