

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
	    request.getRequestDispatcher("link.html").include(request, response); 
	    
		if(pass.equals("abc"))
		{
			out.print("Your login succsfully...."+ " <br>");
			out.print("Welcome "+name);
			
			
			Cookie ck=new Cookie("uname", name);
			response.addCookie(ck);
			
		}
		else
		{
			 out.print("sorry, username or password error!");  
			 
	         request.getRequestDispatcher("login.html").include(request, response);  

		}
		  out.close();  

		
		

		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
