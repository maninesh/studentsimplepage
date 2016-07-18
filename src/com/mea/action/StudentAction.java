package com.mea.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mea.dao.StudentDao;
import com.mea.daoimpl.StudentDaoimpl;
import com.mea.model.Student;

public class StudentAction {

	public void verifyStudent(HttpServletRequest request,
			HttpServletResponse response) {
		String name=request.getParameter("name");
		String level=request.getParameter("level");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		Student student=new Student();
		student.setName(name);
		student.setLevel(level);
		student.setAddress(address);
		student.setPhone(phone);
		student.setGender(gender);
		student.setEmail(email);
		StudentDao sd=new StudentDaoimpl();
		boolean status=sd.verifyStudentDao(student);
		if(status){
//			request.setAttribute("Name",name);
//			request.setAttribute("Password",level);
//			request.setAttribute("Address",address);
//			request.setAttribute("Gender",phone);
//			request.setAttribute("Email",gender);
//			request.setAttribute("Phone",email);
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
			RequestDispatcher rd=request.getRequestDispatcher("studentForm.jsp");
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
		
		// TODO Auto-generated method stub
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////	

	public void getStudentAction(HttpServletRequest request,
			HttpServletResponse response) {
		StudentDao sd=new StudentDaoimpl();
		List<Student> sList=sd.getStudentDao();
		if(sList.size()>0){
			request.setAttribute("STUDENTLIST", sList);
			RequestDispatcher rd=request.getRequestDispatcher("studentDetail.jsp");
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
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(HttpServletRequest request,
			HttpServletResponse response) {
		String id=request.getParameter("id");
		int studentId=Integer.valueOf(id);
		StudentDao sd=new StudentDaoimpl();
		List<Student> sList=sd.deleteStudentDao(studentId);
		if(sList!=null){
			request.setAttribute("MSG","Deleted");
			request.setAttribute("STUDENTLIST", sList);
			RequestDispatcher rd=request.getRequestDispatcher("studentDetail.jsp");
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
//----------------------------edit------------------------------
	/** this method is used to get the data of specific student for edit
	 * 
	 *
	 */
	public void editStudentAction(HttpServletRequest request,
			HttpServletResponse response) {
		String studentId=request.getParameter("id");
		int id=Integer.valueOf(studentId);
		StudentDao sd=new StudentDaoimpl();
		Student student = sd.getStudentForEditDao(id);
		if(student!=null){
			//seting student object for jsp page
			request.setAttribute("STUDENT",student);
			RequestDispatcher rd=request.getRequestDispatcher("editStudent.jsp");
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

	public void updateStudentAction(HttpServletRequest request,
			HttpServletResponse response) {
		String sid=request.getParameter("id");
		String name=request.getParameter("name");
		String level=request.getParameter("level");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		Student student=new Student();
		int id=Integer.valueOf(sid);
		student.setId(id);
		student.setName(name);
		student.setLevel(level);
		student.setAddress(address);
		student.setPhone(phone);
		student.setGender(gender);
		student.setEmail(email);
		StudentDao sd=new StudentDaoimpl();
		List<Student> sList=sd.updateStudentDao(student);
		if(sList!=null){
			request.setAttribute("CSG","Edited");
			request.setAttribute("STUDENTLIST", sList);
			RequestDispatcher rd=request.getRequestDispatcher("studentDetail.jsp");
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
//----------------Search Student Method----------------------------------------------------------------------
	public void searchStudentAction(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		String searchKey=request.getParameter("searchKey");
		//dao/daoimpl ko object create garne
		StudentDao sd=new StudentDaoimpl();
		//to know what the method will return 
		List<Student> sList=sd.searchStudentDao(searchKey);
		if(sList!=null){
			request.setAttribute("STUDENTLIST",sList);
			RequestDispatcher rd=request.getRequestDispatcher("studentDetail.jsp");
			try {
				rd.forward(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			request.setAttribute("BAR","Sorry Couldn't Find Anything");
			RequestDispatcher rd=request.getRequestDispatcher("studentDetail.jsp");
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
