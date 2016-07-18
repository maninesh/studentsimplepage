package com.mea.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mea.dao.BookDao;
import com.mea.dbconnection.DBConnection;
import com.mea.model.BookJavaBeanTest;

public class BookDaoimpl implements BookDao {
	PreparedStatement ps=null;
	Connection con=null;
	int rs=0;
	
	public boolean verifyBook(BookJavaBeanTest bookbean) {
		// TODO Auto-generated method stub
		
		con=DBConnection.getconnection();
		try {
			ps=con.prepareStatement("insert into book(id,name,price,publication,author) values(null,?,?,?,?) ");
			ps.setString(1,bookbean.getName());
			ps.setString(2,bookbean.getPrice());
			ps.setString(3,bookbean.getPublication());
			ps.setString(4,bookbean.getAuthor());
			rs=ps.executeUpdate();
			if(rs>0){
				con.close();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public List<BookJavaBeanTest> getBookDao() {
		// TODO Auto-generated method stub
		BookJavaBeanTest bk=null;
		List<BookJavaBeanTest> sList=new ArrayList<BookJavaBeanTest>();
		ResultSet rs1=null;
		con=DBConnection.getconnection();
		try {
			ps=con.prepareStatement("select * from book");
			rs1=ps.executeQuery();
			while(rs1.next()){
				bk=new BookJavaBeanTest();
				bk.setId(rs1.getInt("id"));
				bk.setName(rs1.getString("name"));
				bk.setPrice(rs1.getString("price"));
				bk.setPublication(rs1.getString("publication"));
				bk.setAuthor(rs1.getString("author"));
				sList.add(bk);
			}
				if(sList.size()>0){
					return sList;
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
