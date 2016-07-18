package com.mea.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mea.dao.BookDao;
import com.mea.daoimpl.BookDaoimpl;
import com.mea.model.BookJavaBeanTest;


public class BookAction {

	public void bookDetailAction(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
	String name=request.getParameter("name");
	String price=request.getParameter("price");
	String publication=request.getParameter("publication");
	String author=request.getParameter("author");
	BookJavaBeanTest bookbean=new BookJavaBeanTest();
	bookbean.setName(name);
	bookbean.setPrice(price);
	bookbean.setPublication(publication);
	bookbean.setAuthor(author);
	BookDao bd=new BookDaoimpl();
	boolean status=bd.verifyBook(bookbean);
	if(status){
		request.setAttribute("msg","Book Detail Uploaded Successfully");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{

		request.setAttribute("msg","Book not Uploaded Successfully");
		RequestDispatcher rd=request.getRequestDispatcher("bookForm.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	public void bookShowAction(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		BookDao bd=new BookDaoimpl();
		List<BookJavaBeanTest> sList=bd.getBookDao();
		if(sList.size()>0){
			request.setAttribute("BOOKLIST",sList);
			RequestDispatcher rd=request.getRequestDispatcher("bookDetail.jsp");
			try {
				rd.forward(request, response);
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
