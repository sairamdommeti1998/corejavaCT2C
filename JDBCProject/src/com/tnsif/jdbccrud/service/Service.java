package com.tnsif.jdbccrud.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tns.jdbccrud.dao.UsingStatement;

public class Service {
	PreparedStatement pst;
	Statement st;
	Connection con;
	CallableStatement cs;
	
	public Service() throws SQLException {
		this.con = UsingStatement.getConnectionObject();
		this.st = con.createStatement();
	}
	//Using Prepared statement
	//Create
	public void addStudent() throws SQLException
	{
		String sql="insert into student1(sid,sname,sbranch) values(104,'tim','IT')";
		this.pst=con.prepareStatement(sql);
		int row=pst.executeUpdate();
		System.out.println(row + "row"+ "afftected");
	}
	//Retrive/Read 
	public void getStudents() throws SQLException{
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
			
		}
	}
	//update
	public void updateStudent() throws SQLException{
		String sql="update student1 set sbranch='MCA' where sid=104";
		int b=st.executeUpdate(sql);
		//System.out.println(b);
		
			System.out.println(b+"  row affected");
	}
	//delete
  public void deleteStudnet() throws SQLException{
	  String sql="delete from student1 where sid=104";
		int i=st.executeUpdate(sql);
		System.out.println(i+"  row affected");
  }
  public void closeSession()
  {
  	try { 
  		  con.close(); 
  		  st.close();
  		  } 
  	  catch(Exception e) {
  	  System.out.println(e); }  
  }
}