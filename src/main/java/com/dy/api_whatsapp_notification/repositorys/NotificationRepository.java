package com.dy.api_whatsapp_notification.repositorys;

import com.dy.api_whatsapp_notification.entitie.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notifications, Integer> {
}
