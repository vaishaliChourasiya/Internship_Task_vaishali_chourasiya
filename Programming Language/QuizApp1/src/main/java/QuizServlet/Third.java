package QuizServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Third() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		int score= (int) session.getAttribute("sc");
		String ans=request.getParameter("third");
		if(ans!=null) {
			if(ans.equalsIgnoreCase("length()")) {
			score++;
			session.setAttribute("sc", score);
			response.sendRedirect("FourthQuiz.html");
		}
			else {
				session.setAttribute("sc", score);
				response.sendRedirect("FourthQuiz.html");
			}
		}
		else {
			session.setAttribute("sc", score);
			response.sendRedirect("FourthQuiz.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
