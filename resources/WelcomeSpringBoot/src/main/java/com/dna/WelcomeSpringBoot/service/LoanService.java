package com.dna.WelcomeSpringBoot.service;

import com.dna.WelcomeSpringBoot.service.impl.MailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanService {

    @Autowired
    private NotificationService notificationService;

    public void approveLoan()
    {
        System.out.println("loan approved successfully!!");
        notificationService.sendNotification();
    }
}
