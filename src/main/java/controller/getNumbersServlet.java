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
 * Servlet implementation class getNumbersServlet
 */
@WebServlet("/getNumbersServlet")
public class getNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userNumCats = request.getParameter("userNumCats");
		Feeder userCats = new Feeder(Integer.parseInt(userNumCats));
		
		request.setAttribute("userCatPouch", userCats);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userCats.toString());
		writer.close();
	}

}
