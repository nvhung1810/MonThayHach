package SOAPTEST;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletRedirect")
public class ServletRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(	HttpServletRequest request, 
							HttpServletResponse response) 
									throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.sendRedirect("https://tomcat.apache.org/download-90.cgi");
	}
}
