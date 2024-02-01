package com.EmployeeManagement;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginAdminServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		AdminData ad=new LoginDAO().login(req.getParameter("uname"), req.getParameter("pword"));
		if(ad==null)
		{
			req.setAttribute("msg","Invalid Login process..<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}
		else
		{
			req.setAttribute("msg"," Login successfull..<br>");
			ServletContext sct=req.getServletContext();
			sct.setAttribute("admin",ad);
			Cookie ck=new Cookie("name",ad.getfName());
			res.addCookie(ck);
			RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
			
			
		}
	}
}
		
	