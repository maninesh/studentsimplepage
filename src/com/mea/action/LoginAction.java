package com.mea.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mea.dao.LoginDao;
import com.mea.daoimpl.LoginDaoimpl;
import com.mea.model.User;

public class LoginAction {


 public void verifyUserLogin(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
	 	String name=request.getParameter("Username");
		String password=request.getParameter("Password");
		User user=new User();
		user.setName(name);
		user.setPassword(password);
		LoginDao ld=new LoginDaoimpl();
		boolean status=ld.verifyUserLoginDao(user);
		if(status){
			//setting the identification of logged in to system
			request.getSession().setAttribute("role","admin");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			try {
				
				rd.forward(request,response);
				
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			try {
				rd.forward(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 }
}
