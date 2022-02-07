package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Feeder;

/**
 * Servlet implementation class getNumbersServlet2
 */
@WebServlet("/getNumbersServlet2")
public class getNumbersServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumbersServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userNumCats = request.getParameter("userNumCats");
		String userCansPerCat = request.getParameter("userCansPerCat");
		String userCansADay = request.getParameter("userCansADay");
		
		Feeder userCats = new Feeder(Integer.parseInt(userNumCats), Integer.parseInt(userCansPerCat), Integer.parseInt(userCansADay));
		
		request.setAttribute("userCatFeeder", userCats);
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userCats.toString());
		writer.close();
	}

}
