package tripme.tripme.notifications;


import org.springframework.data.jpa.repository.JpaRepository;



public interface NotificationStore extends JpaRepository<Notification,Integer> {
    public Notification findNotificationById(int id); 
}
