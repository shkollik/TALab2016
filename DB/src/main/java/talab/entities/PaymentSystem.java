package talab.entities;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class PaymentSystem {
    private int id;
    private String payment_System;

    public PaymentSystem(int id, String payment_System) {
        this.id = id;
        this.payment_System = payment_System;
    }

    @Override
    public String toString() {
        return "PaymentSystem{" +
                "id=" + id +
                ", payment_System='" + payment_System + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayment_System() {
        return payment_System;
    }

    public void setPayment_System(String payment_System) {
        this.payment_System = payment_System;
    }
}
