package tripme.tripme.notifications;

public class Notification {
    private int id;
    private int user;
    private String details;
    private int receiver;
    private int notificationType;
    private boolean isSeen;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser() {
        return user;
    }
    public void setUser(int user) {
        this.user = user;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public int getReceiver() {
        return receiver;
    }
    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
    public int getNotificationType() {
        return notificationType;
    }
    public void setNotificationType(int notificationType) {
        this.notificationType = notificationType;
    }
    public boolean isSeen() {
        return isSeen;
    }
    public void setSeen(boolean isSeen) {
        this.isSeen = isSeen;
    }


    
}
