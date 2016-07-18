package com.mea.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con=null;
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    public static Connection getconnection(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/javawebproject","root","");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
