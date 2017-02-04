package jkcd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/login.do")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException{
		
		String userid = req.getParameter("username");
		String password = req.getParameter("passwd");
		System.out.println("user:" + userid +  "  password: " + password);
		
		req.setAttribute("loginResult", "success");
		req.getRequestDispatcher("/WEB-INF/views/loginresponse.jsp").forward(req, resp);
		
		
	}
	  

}
