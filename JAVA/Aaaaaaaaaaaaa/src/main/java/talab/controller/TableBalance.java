package talab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import talab.dao.BalanceDao;
import talab.dao.DaoFactory;
import talab.entities.Balance;

/**
 * Servlet implementation class TableBalance
 */
@WebServlet("/TableBalance")
public class TableBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text / html;charset=UTF-8");
		   try (PrintWriter out = response.getWriter()) {         
			   			   	
			   	out.println("<table border = 1 >");
			   	out.println("<caption><h4>Balance Table</h4></caption>");
            	out.println("<tr>");
            	out.print("<td>" + "ID" + "</td>");
            	out.print("<td>" + "Card_ID" + "</td>");
            	out.print("<td>" + "Current_Balance" + "</td>");
            	out.print("<td>" + "Current_Date" + "</td>");
            	out.println("</tr >");
		         DaoFactory factory = DaoFactory.getInstance();
		         BalanceDao dao = factory.createBalanceDao();
		         
		         List<Balance> balance = dao.findAll();
		            for (Iterator it = balance.iterator(); it.hasNext();) {
		            	Balance b = (Balance) it.next();		            	
		                out.println("<tr>");
		                out.println("<td>" + b.getId() + "</td>");
		                out.println("<td>" + b.getCardAccounts() + "</td>");
		                out.println("<td>" + b.getCurrentBalance() + "</td>");
		                out.println("<td>" + b.getCurrentDate() + "</td>");		                
		                out.println("</tr >");
		            }
		           out.println("</table>");
		 		   
		           out.println("<h4>Find Clients where balance is more or equal to input value :</h4>");
				   out.println("<form action ='./FindByAmount'>" + 
				   "<input type='text' name='amount' />" +		   
				   "<input type='submit' value='Filter'>");
		        } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
