package com.mea.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mea.action.BookAction;
import com.mea.action.FileUploadAction;
import com.mea.action.LoginAction;
import com.mea.action.SignupAction;
import com.mea.action.StudentAction;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FrontController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String uri=request.getRequestURI();
	if(uri.endsWith("login.san")){
		LoginAction la = new LoginAction();
		la.verifyUserLogin(request,response);
	}else if(uri.endsWith("Signup.san")){
		SignupAction sa = new SignupAction();
		sa.verifyUserSignup(request,response);
	}else if(uri.endsWith("Studentsave.san")){
		StudentAction su = new StudentAction();
		su.verifyStudent(request,response);
	}else if(uri.endsWith("showStudent.san")){
		StudentAction si = new StudentAction();
		si.getStudentAction(request,response);
	}else if(uri.endsWith("deleteStudent.san")){
		StudentAction sc=new StudentAction();
		sc.deleteStudent(request,response);
	}else if(uri.endsWith("editStudent.san")){
		StudentAction sc=new StudentAction();
		sc.editStudentAction(request,response);
	}else if(uri.endsWith("studentUpdate.san")){
		StudentAction sa=new StudentAction();
		sa.updateStudentAction(request,response);
	}
	else if(uri.endsWith("loginPage.san")){
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("signUpPage.san")){
		RequestDispatcher rd=request.getRequestDispatcher("Signup.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("studentFormPage.san")){
		RequestDispatcher rd=request.getRequestDispatcher("studentForm.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("searchStudent.san")){
		StudentAction sa=new StudentAction();
		sa.searchStudentAction(request,response);
	}else if(uri.endsWith("userLogout.san")){
		//destroying the session from the system
		request.getSession().invalidate();
		//return to login.jsp page
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("loadFileUploadPage.san")){
		RequestDispatcher rd=request.getRequestDispatcher("file_upload_example.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("fileUpload.san")){
		FileUploadAction fileUploadAction = new FileUploadAction();
		fileUploadAction.fileUpload(request,response);
	}else if(uri.endsWith("viewFileDetail.san")){
		FileUploadAction fileUploadAction = new FileUploadAction();
		fileUploadAction.showFileDetailAction(request,response);
	}else if(uri.endsWith("loadBookPage.san")){
		RequestDispatcher rd=request.getRequestDispatcher("bookForm.jsp");
		rd.forward(request, response);
	}else if(uri.endsWith("saveBook.san")){
		BookAction ba = new BookAction();
		ba.bookDetailAction(request,response);
	}else if(uri.endsWith("showBookPage.san")){
		BookAction ba=new BookAction();
		ba.bookShowAction(request,response);
	}
}
}	