package com.mea.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mea.dao.FileUploadDao;
import com.mea.dbconnection.DBConnection;
import com.mea.model.FileModel;

public class FileUploadDaoimpl implements FileUploadDao {
	PreparedStatement ps=null;
	int rs=0;
	Connection con=null;
	ResultSet rs1=null;
	public boolean uploadFileDao(Map<String, String> formDataMap) {
		// TODO Auto-generated method stub
		con=DBConnection.getconnection();
		try {
			ps=con.prepareStatement("insert into file_test(id,image_name,name,address) values(null,?,?,?)");
			ps.setString(1,formDataMap.get("fileName"));
			ps.setString(2,formDataMap.get("name"));
			ps.setString(3,formDataMap.get("address"));
			rs=ps.executeUpdate();
			if(rs>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public List<FileModel> showFileDetailDao() {
		// TODO Auto-generated method stub
		con=DBConnection.getconnection();
		List<FileModel> fList=new ArrayList<FileModel>();
		FileModel fm=null;
		try {
			ps=con.prepareStatement("Select * from file_test ");
			rs1=ps.executeQuery();
			while(rs1.next()){
				fm=new FileModel();
				fm.setId(rs1.getInt("id"));
				fm.setImage_name(rs1.getString("image_name"));
				fm.setName(rs1.getString("name"));
				fm.setAddress(rs1.getString("address"));
				fList.add(fm);
			}
			if(fList.size()>0){
				return fList;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
