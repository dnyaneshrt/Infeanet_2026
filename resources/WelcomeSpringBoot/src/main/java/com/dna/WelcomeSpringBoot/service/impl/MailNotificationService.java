package com.dna.WelcomeSpringBoot.service.impl;

import com.dna.WelcomeSpringBoot.service.NotificationService;
import org.springframework.stereotype.Component;

public class MailNotificationService  implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Mail notification sent to customer!!");
    }
}
