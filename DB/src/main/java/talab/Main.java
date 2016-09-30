package talab;

import talab.utilities.Database;

import java.sql.SQLException;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Database db = new Database();

        db.getTableBalance();
        System.out.println(db.getBalanceList().toString());

        db.getTableClients();
        System.out.println(db.getClientsList().toString());

        db.getTableCardAccounts();
        System.out.println(db.getCardAccountsList().toString());

        db.getTableTransactions();
        System.out.println(db.getTransactionsList().toString());

        db.getTablePaymentSystem();
        System.out.println(db.getPaymentSystemList().toString());

        db.getTableCardStatus();
        System.out.println(db.getCardStatusList().toString());
    }
}
