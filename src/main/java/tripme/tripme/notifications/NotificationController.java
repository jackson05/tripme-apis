package tripme.tripme.notifications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {
@Autowired
private NotificationService notificationService;

@PostMapping("/notifications")
public ResponseEntity<Notification> saveNotification(Notification notification){

Notification not= notificationService.store(notification); 
 return ResponseEntity.ok(not);
 
}

@GetMapping("/notifications")
public ResponseEntity<List<Notification>> notifications(){
    return  ResponseEntity
    .ok(notificationService
    .findNotifications());
    
}

@PutMapping("/notifications")
public ResponseEntity<Notification> editNotification(Notification notification){

 return ResponseEntity
        .ok(notificationService
        .store(notification)); 
}

@DeleteMapping("/notifications")
public ResponseEntity<Notification> deleteNotification(Notification notification){

 return ResponseEntity
        .ok(notificationService
        .delete(notification));
 
}
    
}
