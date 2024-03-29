package com.chaitanya.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic javaTopic() {
		return TopicBuilder.name("java")
				.build();
	}
	
	@Bean
	public NewTopic javajsonTopic() {
		return TopicBuilder.name("java_json")
				.build();
	}
}
