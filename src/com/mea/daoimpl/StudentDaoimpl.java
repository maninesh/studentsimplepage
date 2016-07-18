package com.mea.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mea.dao.StudentDao;
import com.mea.dbconnection.DBConnection;
import com.mea.model.Student;

public class StudentDaoimpl implements StudentDao {
 PreparedStatement ps=null;
 int rs = 0;
 ResultSet resultSet=null;
 Connection con = null;
 
public boolean verifyStudentDao(Student student) {
	con=DBConnection.getconnection();
	try {
		ps=con.prepareStatement("insert into student(id,name,level,Address,phone,gender,email) VALUES(null,?,?,?,?,?,?)");
		ps.setString(1,student.getName());
		ps.setString(2,student.getLevel());
		ps.setString(3,student.getAddress());
		ps.setString(4,student.getPhone());
		ps.setString(5,student.getGender());
		ps.setString(6,student.getEmail());
		rs = ps.executeUpdate();
		if(rs>0){
			con.close();
			ps=null;
		return true;//login bhayo aba
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// TODO Auto-generated method stub

	
	return false;
}
//---------------------------------------
public List<Student> getStudentDao() {
	Student st=null;
	List<Student> sList=new ArrayList<Student>();
	con=DBConnection.getconnection();
	ResultSet rs1=null;
	try {
		ps=con.prepareStatement("Select * from student");
		rs1=ps.executeQuery();
		while(rs1.next()){
			st=new Student();
			st.setId(rs1.getInt("id"));
			st.setName(rs1.getString("Name"));
			st.setLevel(rs1.getString("Level"));
			st.setAddress(rs1.getString("Address"));
			st.setPhone(rs1.getString("Phone"));
			st.setGender(rs1.getString("Gender"));
			st.setEmail(rs1.getString("Email"));
			sList.add(st);
		}
		if(sList.size()>0){
			return sList;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	// TODO Auto-generated method stub
	return null;
}
//--------------------------------------
public List<Student> deleteStudentDao(int studentId){
	 PreparedStatement ps=null;
	 int rs = 0;
	 Connection con = null;
	 con=DBConnection.getconnection();
	 try {
		ps=con.prepareStatement("Delete student from student where id=?");
		ps.setInt(1,studentId);
		rs=ps.executeUpdate();
		if(rs>0){
			List<Student> sList=getStudentDao();
			return sList;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
	
}
//---------------------------edit---------------------------
public Student getStudentForEditDao(int id) {
	PreparedStatement ps1=null;
	Connection connection =null;
	ResultSet result=null;
	connection=DBConnection.getconnection();
	try {
		ps1=connection.prepareStatement("select * from student where id= ?");
		ps1.setInt(1, id);
		result=ps1.executeQuery();
		Student st=null;
		if(result.next()){
			st=new Student();
			st.setId(result.getInt("id"));
			st.setName(result.getString("name"));
			st.setAddress(result.getString("address"));
			st.setEmail(result.getString("email"));
			st.setGender(result.getString("gender"));
			st.setLevel(result.getString("level"));
			st.setPhone(result.getString("phone"));
		}
		if(st!=null){
			return st;
		}
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	
	
}
public List<Student> updateStudentDao(Student student) {
	// TODO Auto-generated method stub
	PreparedStatement ps3 = null;
	Connection con3 = null;
	int rs3=0;
	con3 = DBConnection.getconnection();
	try {
		ps3=con3.prepareStatement("Update student set name=?,level=?,address=?,phone=?,gender=?,email=? where id=?");
		ps3.setString(1,student.getName());
		ps3.setString(2,student.getLevel());
		ps3.setString(3,student.getAddress());
		ps3.setString(4,student.getPhone());
		ps3.setString(5,student.getGender());
		ps3.setString(6,student.getEmail());
		ps3.setInt(7,student.getId());
		rs3=ps3.executeUpdate();
		if(rs3>0){
			List<Student> sList=getStudentDao();
			con3.close();
			return sList;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}
public List<Student> searchStudentDao(String searchKey) {
	//ps,resultSet,con are globally declare i.e. class ko muni cha
	Student st=null;
	List<Student> sList=new ArrayList<Student>();
	con=DBConnection.getconnection();
	try {
		ps=con.prepareStatement("Select * from student where name LIKE '%"+searchKey+"%'  ");
//Since We have not used ? so we don't need ps.setString(1,searchKey).........
		resultSet=ps.executeQuery();
		while(resultSet.next()){
			st=new Student();
			st.setId(resultSet.getInt("id"));
			st.setName(resultSet.getString("Name"));
			st.setLevel(resultSet.getString("Level"));
			st.setAddress(resultSet.getString("Address"));
			st.setPhone(resultSet.getString("Phone"));
			st.setGender(resultSet.getString("Gender"));
			st.setEmail(resultSet.getString("Email"));
			sList.add(st);
		}
		if(sList.size()>0){
			con.close();
			resultSet=null;
			ps=null;
			return sList;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
