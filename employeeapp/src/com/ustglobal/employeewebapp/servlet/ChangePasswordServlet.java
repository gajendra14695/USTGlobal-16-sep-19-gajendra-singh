package com.ustglobal.employeewebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.employeewebapp.dao.EmployeeDAO;
import com.ustglobal.employeewebapp.dto.EmployeeInfo;
import com.ustglobal.employeewebapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session =req.getSession(false);
		
		if(session!=null) {
			
			String pass= req.getParameter("password");
			String confirmpass= req.getParameter("conformpassword");
			
			if(pass.equals(confirmpass)) {
				
				EmployeeInfo info= (EmployeeInfo)session.getAttribute("info");
				EmployeeDAO dao= EmployeeDaoManager.getEmployeeDAO();
				
				dao.changePassword(info.getId(), pass);
				
				RequestDispatcher dispatcher= req.getRequestDispatcher("./home");
				dispatcher.forward(req, resp);

				
			}else {
				
				String msg="Password not matching";
				req.setAttribute("msg", msg);
			//	PrintWriter out = resp.getWriter();
//				out.println("<html>");
//				out.println("<h4>Password not matching </h4>");
//				out.println("</html>");
//				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.jsp");
				dispatcher.forward(req, resp);
				
			}
			
			
			
			
		}else {
			RequestDispatcher dispatcher =req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
}
