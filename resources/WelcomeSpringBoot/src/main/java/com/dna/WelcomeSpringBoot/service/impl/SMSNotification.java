package com.dna.WelcomeSpringBoot.service.impl;

import com.dna.WelcomeSpringBoot.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SMSNotification  implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent to customer!!");
    }
}
