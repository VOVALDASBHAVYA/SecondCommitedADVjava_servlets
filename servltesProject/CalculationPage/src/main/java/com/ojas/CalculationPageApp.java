package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;

/**
 * Servlet implementation class CalculationPageApp
 */
@WebServlet(name="./calculation")
public class CalculationPageApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationPageApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter  out=response.getWriter();
		response.setContentType("text/html");
//		int n1=ParseInt(request.getParameter("t1"));
		String name=request.getParameter("NumberOne");
		String name1=request.getParameter("NumberTwo");
		out.println("Welcome "+(name+name1));
//		out.println(""+(name-name1));
	}


}
