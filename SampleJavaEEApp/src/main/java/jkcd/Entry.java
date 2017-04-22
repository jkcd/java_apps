package jkcd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/EntryPoint.do")
public class Entry extends HttpServlet{
	
  protected void doGet (HttpServletRequest req, HttpServletResponse resp)
		   throws ServletException, IOException{
	  
	  req.setAttribute("myarg", req.getParameter("myarg"));
	  req.getRequestDispatcher("/WEB-INF/views/entry.jsp").forward(req, resp);
	  System.out.println("my query param:" + req.getParameter("myarg"));
	  
	  
	  /*
	  * bad way of writing response, switch to jsp rather
	  PrintWriter out = resp.getWriter();
	  out.println("<html>");
	  out.println("<head>");
	  out.println("<title>");
	  out.println("My Java EE Web Application!");
	  out.println("</title>");
	  out.println("</head>");
	  out.println("<body>");
	  out.println("<p>");
	  out.println("This is a sample Servlet Application!!");
	  out.println("</p>");
	  out.println("</body>");
	  out.println("</html>");
	  */
	  
	   
	   
   }
	  

}
