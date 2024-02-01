package com.EmployeeManagement;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterAdminServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		AdminData ad=new AdminData();
		ad.setuName(req.getParameter("uname"));
		ad.setpWord(req.getParameter("pword"));
		ad.setfName(req.getParameter("pword"));
		ad.setlName(req.getParameter("lname"));
		ad.setAddr(req.getParameter("addr"));
		ad.setmId(req.getParameter("mid"));
		ad.setPhNo(Long.parseLong(req.getParameter("phno")));
		int k=new RegisterAdminDAO().register(ad);
		if(k>0)
		{
			req.setAttribute("msg","User REGISTERED Successfully ..<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		
		
	}
	

}
