package com.mea.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mea.dao.SignupDao;
import com.mea.dbconnection.DBConnection;
import com.mea.model.User;

public class SignupDaoimpl implements SignupDao {

	PreparedStatement ps=null;
	int rs=0;
	Connection con=null;
	

	public boolean verifyUserSignupDao(User user) {
		con=DBConnection.getconnection();
		try {
			ps=con.prepareStatement("insert into user(id,name,Password,Address,Gender,Email,Phone) VALUES(null,?,?,?,?,?,?)");
			ps.setString(1,user.getName());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getAddress());
			ps.setString(4,user.getGender());
			ps.setString(5,user.getEmail());
			ps.setString(6,user.getPhone());
			rs = ps.executeUpdate();
			if(rs>0){
				
			return true;//login bhayo aba
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

}
