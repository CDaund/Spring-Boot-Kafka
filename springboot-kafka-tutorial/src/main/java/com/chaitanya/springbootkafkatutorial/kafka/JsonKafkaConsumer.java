package com.chaitanya.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.chaitanya.springbootkafkatutorial.payload.User;

@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "java_json", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
	}

}