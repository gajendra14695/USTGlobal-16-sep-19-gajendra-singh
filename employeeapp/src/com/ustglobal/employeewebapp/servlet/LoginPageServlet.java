package com.ustglobal.employeewebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	PrintWriter out = resp.getWriter();
	
	String id="";
	Cookie[] cookies=req.getCookies();
	if(cookies!=null) {
	for (Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id=cookie.getValue();
		}
	}
	}
	out.println("<html>");
	out.println("<fieldset align ='center'>");
		out.println("<legend>login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table align ='center'>");
		out.println("<tr><td>Id</td>");
		out.println("<td><input type='number' name='id' value='"+id+"'></td></tr>");
		out.println("<tr> <td>Password</td>");
		out.println("<td><input type='password' name='password'></td> </tr>");
						
		out.println("<tr><td><input type = 'checkbox' name ='rememberme' value='checked'></td></tr>"); 
		out.println("<tr><td>Remember Me</td></tr>");
				
					
					
		out.println("<tr>\r\n" + 
				"			<td></td>\r\n" + 
				"			<td><input type = 'submit' value = 'login'></td>\r\n" + 
				"			</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println( 
				" <a href='./register.html'>Register</a>");
		out.println("</fieldset>");
		out.println("</html>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
