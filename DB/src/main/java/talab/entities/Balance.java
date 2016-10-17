package talab.entities;

import java.util.Date;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Balance {
    private int id;
    private int cardAccounts;
    private int currentBalance;
    private String currentDate;

    public Balance(int id, int cardAccounts, int currentBalance, String currentDate) {
        this.id = id;
        this.cardAccounts = cardAccounts;
        this.currentBalance = currentBalance;
        this.currentDate = currentDate;
    }


    public Balance() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Balance balance = (Balance) o;

        if (id != balance.id) return false;
        if (cardAccounts != balance.cardAccounts) return false;
        if (currentBalance != balance.currentBalance) return false;
        return currentDate != null ? currentDate.equals(balance.currentDate) : balance.currentDate == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cardAccounts;
        result = 31 * result + currentBalance;
        result = 31 * result + (currentDate != null ? currentDate.hashCode() : 0);
        return result;
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

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}
