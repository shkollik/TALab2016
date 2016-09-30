package talab.entities;

import java.util.Date;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Transactions {
    private int id;
    private Date dateTime;
    private int amount;
    private int transactionTypeId;
    private int cardAccountsId;

    public Transactions(int id, Date dateTime, int amount, int transactionTypeId, int cardAccountsId) {
        this.id = id;
        this.dateTime = dateTime;
        this.amount = amount;
        this.transactionTypeId = transactionTypeId;
        this.cardAccountsId = cardAccountsId;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", amount=" + amount +
                ", transactionTypeId=" + transactionTypeId +
                ", cardAccountsId=" + cardAccountsId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public int getCardAccountsId() {
        return cardAccountsId;
    }

    public void setCardAccountsId(int cardAccountsId) {
        this.cardAccountsId = cardAccountsId;
    }
}
