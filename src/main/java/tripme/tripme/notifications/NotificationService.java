package tripme.tripme.notifications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service
public class NotificationService {

    @Autowired
    private NotificationStore notificationStore;

    public Notification store(Notification notification){
        return notificationStore.save(notification);
    }

    public List<Notification> findNotifications(){
        return notificationStore.findAll();
    }

    public Notification getNotification(int id){
        return notificationStore.findNotificationById(id);
    }

    public Notification delete(Notification notification){
         notificationStore.delete(notification);
         return notification;
    }

   
    
}
