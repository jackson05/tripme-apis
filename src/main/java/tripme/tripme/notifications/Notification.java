package tripme.tripme.notifications;

public class Notification {
    private int id;
    private int user;
    private String details;
    private int receiver;
    private String notificationType;
    private boolean delivired;
    private boolean read;
    
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
    public String getNotificationType() {
        return notificationType;
    }
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public boolean isDelivired() {
        return delivired;
    }
    public void setDelivired(boolean delivired) {
        this.delivired = delivired;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    


    
}
