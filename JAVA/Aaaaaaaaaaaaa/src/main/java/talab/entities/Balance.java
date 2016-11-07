package talab.entities;

//import java.util.Date;

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
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", cardAccounts=" + cardAccounts +
                ", currentBalance=" + currentBalance +
                ", currentDate=" + currentDate +
                '}';
    }   


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardAccounts;
		result = prime * result + currentBalance;
		result = prime * result + ((currentDate == null) ? 0 : currentDate.hashCode());
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balance other = (Balance) obj;
		if (cardAccounts != other.cardAccounts)
			return false;
		if (currentBalance != other.currentBalance)
			return false;
		if (currentDate == null) {
			if (other.currentDate != null)
				return false;
		} else if (!currentDate.equals(other.currentDate))
			return false;
		if (id != other.id)
			return false;
		return true;
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
