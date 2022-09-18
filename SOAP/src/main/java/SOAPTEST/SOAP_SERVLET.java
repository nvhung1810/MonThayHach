package SOAPTEST;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SOAP_SERVLET")
public class SOAP_SERVLET extends HttpServlet {
	private static final long serialVersionUID = 2L;

	protected void doGet(	HttpServletRequest request, 
							HttpServletResponse response) 
						    throws ServletException, IOException 
	{
		response.setContentType("test/html");
		PrintWriter pw=response.getWriter();
		pw.println("Khoa CNTT");
		String name = request.getParameter("name");
		pw.println("Xin chao cac ban sinh vien ");
	}
}
