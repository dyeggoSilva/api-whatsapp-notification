package com.dy.api_whatsapp_notification.services;

import com.twilio.Twilio;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class NotificationService {

    private static final String ACCOUNT_SID = "YOUR_TWILIO_ACCOUNT_SID";
    private static final String AUTH_TOKEN = "YOUR_TWILIO_AUTH_TOKEN";
    private static final String FROM_PHONE = "whatsapp:+YOUR_TWILIO_PHONE";

    public String sendWhatsAppMessage(String phoneNumber, String messageContent) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        try {
            Message message = Message.creator(
                    new PhoneNumber("whatsapp:" + phoneNumber),
                    new PhoneNumber(FROM_PHONE),
                    messageContent
            ).create();
            return "Message sent successfully: " + message.getSid();
        } catch (Exception e) {
            return "Error sending message: " + e.getMessage();
        }
    }

}
