package talab.entities;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class CardStatus {
    private int id;
    private String currentStatus;

    public CardStatus(int id, String currentStatus) {
        this.id = id;
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "CardStatus{" +
                "id=" + id +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
