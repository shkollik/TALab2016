package talab.entities;

import java.util.Date;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Balance {
    private int id;
    private int cardAccounts;
    private int currentBalance;
    private Date currentDate;

    public Balance(int id, int cardAccounts, int currentBalance, Date currentDate) {
        this.id = id;
        this.cardAccounts = cardAccounts;
        this.currentBalance = currentBalance;
        this.currentDate = currentDate;
    }


    public Balance() {
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", cardAccounts=" + cardAccounts +
                ", currentBalance=" + currentBalance +
                ", currentDate=" + currentDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(int cardAccounts) {
        this.cardAccounts = cardAccounts;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
