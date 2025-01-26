package QuizServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Fifth extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Fifth() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		int score= (int) session.getAttribute("sc");
		String ans=request.getParameter("fifth");
		if(ans!=null) {
			if(ans.equalsIgnoreCase("Both A and B")) {
			score++;
			session.setAttribute("sc", score);
			response.sendRedirect("Result");
		}
			else {
				session.setAttribute("sc", score);
				response.sendRedirect("Result");
			}
		}
		else {
			session.setAttribute("sc", score);
			response.sendRedirect("Result");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
