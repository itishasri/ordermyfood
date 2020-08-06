package com.omfkafkaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omfkafkaservice.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
