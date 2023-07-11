package com.example.coursework6bot.repository;

import com.example.coursework6bot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);

    List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime, long chat_Id);
}

