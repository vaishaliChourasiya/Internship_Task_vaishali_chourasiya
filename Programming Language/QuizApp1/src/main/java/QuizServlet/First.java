package QuizServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		int score=0;
		String ans=request.getParameter("first");
		System.out.println(ans);
		if(ans!=null)
		{
			if(ans.equalsIgnoreCase("false")) 
			{
			score++;
			System.out.println("if bloack first servlet "+score);
			session.setAttribute("sc", score);
			System.out.println("going to second");
			response.sendRedirect("SecondQuiz.html");
			}
			else
			{
				session.setAttribute("sc", score);
				response.sendRedirect("SecondQuiz.html");
			}
		}
		else 
		{
			session.setAttribute("sc", score);
			response.sendRedirect("SecondQuiz.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
