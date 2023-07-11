package com.example.coursework6bot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="notification_tasks")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String message;
    private long chatId;
    private LocalDateTime notificationDateTime;

    public NotificationTask(long id, String message, long chatId, LocalDateTime notificationDateTime) {
        this.id = id;
        this.message = message;
        this.chatId = chatId;
        this.notificationDateTime = notificationDateTime;
    }

    public NotificationTask() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chaiId) {
        this.chatId = chaiId;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }
}
