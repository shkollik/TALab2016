package talab.utilities;

import talab.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Database {
    List<Clients> clientsList = new ArrayList<>();
    List<Balance> balanceList = new ArrayList<>();
    List<CardAccounts> cardAccountsList = new ArrayList<>();
    List<Transactions> transactionsList = new ArrayList<>();
    List<PaymentSystem> paymentSystemList = new ArrayList<>();
    List<CardStatus> cardStatusList = new ArrayList<>();
    Connection connection;

    public void getConnetion() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "root");

    }

    public void closeConnetion() throws SQLException {
        connection.close();

    }

    public void getTableBalance() throws SQLException {
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM balance")){
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Balance balance = new Balance(rs.getInt("id"), rs.getInt("card_accounts_id"),
                        rs.getInt("current_balance"), rs.getString("current_date"));
                balanceList.add(balance);
            }
        }
    }

    public void getTableClients() throws SQLException {
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM clients")){
            ResultSet rs = query.executeQuery();
            Clients clients;
            while(rs.next()){
                clients = new Clients(rs.getInt("id"), rs.getString("surname"),
                        rs.getString("name"), rs.getString("identification code"),
                        rs.getString("phone number"));
                clientsList.add(clients);
            }
        }
    }

    public void getTableCardAccounts() throws SQLException {
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM card_accounts")){
            ResultSet rs = query.executeQuery();
            CardAccounts cardAccounts;
            while(rs.next()){
                cardAccounts = new CardAccounts(rs.getInt("id"), rs.getString("card_number"),
                        rs.getDate("from"), rs.getDate("to"), rs.getInt("client_id"),
                        rs.getInt("payment_system_id"), rs.getInt("card_status_id"));
                cardAccountsList.add(cardAccounts);
            }
        }
    }

    public void getTableTransactions() throws SQLException {
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM transactions")){
            ResultSet rs = query.executeQuery();
            Transactions transactions;
            while(rs.next()){
                transactions = new Transactions(rs.getInt("id"), rs.getDate("date"), rs.getInt("amount"),
                        rs.getInt("transaction_type_id"), rs.getInt("card_accounts_id"));
                transactionsList.add(transactions);
            }
        }
    }

    public void getTablePaymentSystem() throws SQLException {
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM payment_system")){
            ResultSet rs = query.executeQuery();
            PaymentSystem payment_system;
            while(rs.next()){
                payment_system = new PaymentSystem(rs.getInt("id"),
                        rs.getString("payment_system"));
                paymentSystemList.add(payment_system);
            }
        }
    }

    public void getTableCardStatus() throws SQLException {

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM card_status")){
            ResultSet rs = query.executeQuery();
            CardStatus cardStatus;
            while(rs.next()){
                cardStatus = new CardStatus(rs.getInt("id"),
                        rs.getString("current_status"));
                cardStatusList.add(cardStatus);
            }
        }
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public List<Balance> getBalanceList() {
        return balanceList;
    }

    public List<CardAccounts> getCardAccountsList() {
        return cardAccountsList;
    }


    public List<Transactions> getTransactionsList() {
        return transactionsList;
    }

    public List<PaymentSystem> getPaymentSystemList() {
        return paymentSystemList;
    }

    public List<CardStatus> getCardStatusList() {
        return cardStatusList;
    }
}
