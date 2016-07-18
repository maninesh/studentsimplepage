package com.mea.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mea.dao.SignupDao;
import com.mea.daoimpl.SignupDaoimpl;
import com.mea.model.User;

public class SignupAction {
	public void verifyUserSignup(HttpServletRequest request,
			HttpServletResponse response) {
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String address=request.getParameter("address");
	String gender=request.getParameter("Gender");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	User user=new User();
	user.setName(name);
	user.setPassword(password);
	user.setAddress(address);
	user.setGender(gender);
	user.setEmail(email);
	user.setPhone(phone);
	SignupDao sd=new SignupDaoimpl();
	boolean status=sd.verifyUserSignupDao(user);
	if(status){//setting the identification of logged in to system
		request.getSession().setAttribute("role","admin");
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
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
		RequestDispatcher rd=request.getRequestDispatcher("Signup.jsp");
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

