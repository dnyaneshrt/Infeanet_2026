package com.dna.WelcomeSpringBoot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    void sendNotification();
}
