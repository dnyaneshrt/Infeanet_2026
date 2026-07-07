package com.dna.WelcomeSpringBoot.service.impl;

import com.dna.WelcomeSpringBoot.service.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class WhatsAppNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("WhatApp notification sent to customer!!");
    }
}
