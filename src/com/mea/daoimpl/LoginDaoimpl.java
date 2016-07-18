package com.mea.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mea.dao.LoginDao;
import com.mea.dbconnection.DBConnection;
import com.mea.model.User;


public class LoginDaoimpl implements LoginDao {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection con=null;
	
	public boolean verifyUserLoginDao(User user) {
		// TODO Auto-generated method stub	
		con=DBConnection.getconnection();
		try {
			ps=con.prepareStatement("Select * from user where name=? and password=?");
			ps.setString(1,user.getName());
			ps.setString(2,user.getPassword());
			rs = ps.executeQuery();
			if(rs.next()){
				
			return true;//login bhayo aba
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
