package com.dna.WelcomeSpringBoot.service.impl;

import com.dna.WelcomeSpringBoot.service.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@ConditionalOnProperty(name="notification.mode",havingValue = "sms")
@Service("sms")
public class SMSNotification  implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent to customer!!");
    }
}
