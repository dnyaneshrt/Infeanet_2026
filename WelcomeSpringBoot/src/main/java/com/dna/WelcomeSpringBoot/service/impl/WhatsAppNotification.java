package com.dna.WelcomeSpringBoot.service.impl;

import com.dna.WelcomeSpringBoot.service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@ConditionalOnProperty(name="notification.mode",havingValue = "whatsapp")
@Component
@Primary
public class WhatsAppNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("WhatApp notification sent to customer!!");
    }
}
