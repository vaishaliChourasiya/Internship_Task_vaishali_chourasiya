package QuizServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Second() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		int score= (int) session.getAttribute("sc");
		System.out.println(score);
		String ans=request.getParameter("second");
		System.out.println("ans of second"+ans);
		if(ans!=null) {
			if(ans.equalsIgnoreCase("Final")) {
			score++;
			System.out.println("inside if");
			System.out.println(score );
			session.setAttribute("sc", score);
			response.sendRedirect("ThirdQuiz.html");
		}
			else {
				session.setAttribute("sc", score);
				response.sendRedirect("ThirdQuiz.html");
			}
		}
		else {
			session.setAttribute("sc", score);
			response.sendRedirect("ThirdQuiz.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
