package talab.controller;

import talab.entities.Balance;
import talab.services.BalanceService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/11/2016.
 */
public class OldController {
    BalanceService service = BalanceService.getInstance();

    public OldController() throws ClassNotFoundException {
    }

//    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
//        // TODO Auto-generated method stub
//        new OldController().doServiceBalanceBonus("500","10");
//
//    }

    public List<Balance> doServiceBalanceBonus(String amount , String bonus) throws IOException, SQLException {
    	int amountVal = Integer.parseInt(amount);
    	int bonusVal = Integer.parseInt(bonus);
        if (  amountVal < 0 || bonusVal<0 || bonusVal>=100 ){
        	throw new IllegalArgumentException();
        }               
        List<Balance> balance = service.getBalanceWithBonus(amountVal, bonusVal);               
        return balance;
        
    }
    
    public List<Balance> doServiceBalanceByAmount(String amount) throws IOException, SQLException {
        int amountVal = Integer.parseInt(amount);      
        List<Balance> balance = service.getBalanceByAmount(amountVal);       
        return balance;
    }
    
    public List<Balance> doServiceBalance() throws IOException, SQLException {
        List<Balance> balance = service.getBalance();       
        return balance;
    }
    
    public PrintWriter buildTableHeader(PrintWriter out){
	   	out.println("<table border = 1 >");
	   	out.println("<caption><h4>Balance Table</h4></caption>");
    	out.println("<tr>");
    	out.print("<td>" + "ID" + "</td>");
    	out.print("<td>" + "Card_ID" + "</td>");
    	out.print("<td>" + "Current_Balance" + "</td>");
    	out.print("<td>" + "Current_Date" + "</td>");
    	out.println("</tr >");
	   	return out;
    }
    
    public PrintWriter buildTableBody(PrintWriter out, List<Balance> balance){
        for (Iterator it = balance.iterator(); it.hasNext();) {
        	Balance b = (Balance) it.next();		            	
            out.println("<tr>");
            out.println("<td>" + b.getId() + "</td>");
            out.println("<td>" + b.getCardAccounts() + "</td>");
            out.println("<td>" + b.getCurrentBalance() + "</td>");
            out.println("<td>" + b.getCurrentDate() + "</td>");		                
            out.println("</tr >");
        }
        return out;
      
    }
    
    public PrintWriter buildTableFooter(PrintWriter out){
    	 out.println("</table>");
    	 return out;
    }

}
