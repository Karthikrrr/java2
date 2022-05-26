package com.sharma;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletPageTesting")
public class ServletPageTesting extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price1=1.1,price2=1.1;
		response.setIntHeader("Refresh", 5);
		// Get current time
		DateFormat dateFormat = new SimpleDateFormat(" yyyy/MM/dd HH:mm:ss ");
		Date date = new Date();
		
		price1 = price1 * .43;
		price2 = price2 * 1.33;
	
		
		StringBuilder sb = new StringBuilder();
		 sb.append("<html>")
         .append("<body  style=background-color:pink;>")
         .append("<h1>"+"Auto Page Refresh using Servlet"+"</h1>")
         .append("<h2>Current Time is:</h2>" +dateFormat.format(date))
         .append("<table >")
         .append("<tr >")
         .append("<th>Stock</th>")
         .append("<th >Price</th>")
         .append("</tr>")
         .append("<tr ><td>ABC</td><td>"+price1+"</td></tr>")
         .append("<tr><td>XYZ</td><td>"+price2+"</td></tr>")
         .append("</table>")
         .append("</body>")
         .append("</html>");
		 response.getWriter().write(sb.toString());
	}

}
