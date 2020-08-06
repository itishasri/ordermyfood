package com.omfkafkaservice.listener;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.omfkafkaservice.model.Notification;
import com.omfkafkaservice.repository.NotificationRepository;

@Service
public class KafkaConsumer {

	@Autowired NotificationRepository notificationRepository;
	
    @KafkaListener(topics = "testcustomer", groupId = "group_id")
    public void consume(String message) {
    	Notification notification = new Notification();
    	notification.setCreateDateTime(LocalDateTime.now());
    	notification.setType("CUSTOMER CREATION");
    	notification.setMessage(message);
    	notificationRepository.save(notification);
    }
}
