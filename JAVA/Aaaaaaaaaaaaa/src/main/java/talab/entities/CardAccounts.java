package talab.entities;

import java.util.Date;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class CardAccounts {
    private int id;
    private String card_number;
    private Date from;
    private Date to;
    private int clientId;
    private int paymentSystem_id;
    private int cardStatusId;

    public CardAccounts(int id, String card_number, Date from, Date to, int clientId, int paymentSystem_id, int cardStatusId) {
        this.id = id;
        this.card_number = card_number;
        this.from = from;
        this.to = to;
        this.clientId = clientId;
        this.paymentSystem_id = paymentSystem_id;
        this.cardStatusId = cardStatusId;
    }

    @Override
    public String toString() {
        return "CardAccounts{" +
                "id=" + id +
                ", card_number='" + card_number + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", clientId=" + clientId +
                ", paymentSystem_id=" + paymentSystem_id +
                ", cardStatusId=" + cardStatusId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getPaymentSystem_id() {
        return paymentSystem_id;
    }

    public void setPaymentSystem_id(int paymentSystem_id) {
        this.paymentSystem_id = paymentSystem_id;
    }

    public int getCardStatusId() {
        return cardStatusId;
    }

    public void setCardStatusId(int cardStatusId) {
        this.cardStatusId = cardStatusId;
    }
}
