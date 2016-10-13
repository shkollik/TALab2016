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

import talab.entities.Balance;

import talab.controller.OldController;


/**
 * Servlet implementation class GoodsDiscountController
 */
@WebServlet("/BalanceBonusController")
public class BalanceBonusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BalanceBonusController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			String amountVal = request.getParameter("amount");
			String bonusVal = request.getParameter("bonus");
			
			out.println("<table border = 1 >");
		   	out.println("<caption><h4>Balance Table</h4></caption>");
			List<Balance> balance = new OldController().doServiceBalanceBonus(amountVal, bonusVal);			
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
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
