package com.dy.api_whatsapp_notification.controllers;

import com.dy.api_whatsapp_notification.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")

public class NotificationControllerController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public String sendNotification(@RequestParam String phoneNumber, @RequestParam String message) {
        return notificationService.sendWhatsAppMessage(phoneNumber, message);
    }
}
