package com.example.coursework6bot.configuration;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramBotConfiguration {
    @Bean
    public TelegramBot telegramBot(@Value("${telegram.bot.token}") String token) {
        return new TelegramBot(token);
    }
//    private final String token;
//
//    public TelegramBotConfiguration(@Value("${telegram.bot.token}") String token) {
//        this.token = token;
//    }
//
//    @Bean
//    public TelegramBot telegramBot() {
//        return new TelegramBot(token);
//    }
}
