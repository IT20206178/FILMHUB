package service;

import java.sql.Connection;




import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import model.Asking;
import util.DBConnect;

public class Askingdbutil implements AskingInterface {
	
	//assign variables
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//validate method
	public boolean validate(String uname, String uid){
		
		//start try-catch exception
		try {
			
			//database connection
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			
			//reading the values of database
			String sql="select * from asking where uname='"+uname+"'and uid='"+uid+"'";
			
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
    			isSuccess=true;
    		}else {
    			isSuccess=false;
    		}
			
		}
		//exception handler
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	
	
	//getAsking method
	public List <Asking> getAsking(String uname1){
		
		//create array list 
		ArrayList<Asking> uploader = new ArrayList<>();
		
		try {
			//database connection
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			
			
			//read date from the database
			String sql="select * from asking where uname='"+uname1+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				//get table column values to the variables from line to line
				int id = rs.getInt(1);
    			String uname = rs.getString(2);
    			String uid = rs.getString(3);
    			String phone = rs.getString(4);
    			String film = rs.getString(5);
    			String date = rs.getString(6);
    			
    			//create object
    			Asking up=new Asking(id,uname,uid,phone,film,date);
    			uploader.add(up);
			}
		}catch(Exception e){     //exception
			e.printStackTrace();
			
		}
		
		return uploader;
	}
	
	
	
	
	
	
	//insertAsking method
	public boolean insertAsking(String uname, String uid, String phone, String film, String date) {
		boolean isSuccess=false;
 		
		
		try {
			//database connection
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			
			//inserting values to  the database
			String sql="insert into asking values(0,'"+uname+"','"+uid+"','"+phone+"','"+film+"','"+date+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {  //exception
			e.printStackTrace();		}
		
		return isSuccess;
		
	}
	
	
	
	
	
	    //updateAsking1 method
		public boolean updateAsking1(String id, String uname, String uid, String phone, String film, String date) {
    	
    	try {
    		//database connection
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		
    		//update values to database
    		String sql = "update asking set uname='"+uname+"',uid='"+uid+"',phone='"+phone+"',film='"+film+"',date='"+date+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {  //exception
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
		
		
		
		
		//array list
		 public  List<Asking> getAskingDetails(String Id) {
		    	
			 //convert String to Integer
		    	int convertedID = Integer.parseInt(Id);
		    	
		    	ArrayList<Asking> up = new ArrayList<>();
		    	
		    	try {
		    		//database connection
		    		con = DBConnect.getConnection();
		    		stmt = con.createStatement();
		    		
		    		//reading database values
		    		String sql = "select * from asking where id='"+convertedID+"'";
		    		rs = stmt.executeQuery(sql);
		    		
		    		while(rs.next()) {
		    			//get table column values to the variables from line to line
		    			int id = rs.getInt(1);
		    			String uname = rs.getString(2);
		    			String uid = rs.getString(3);
		    			String phone = rs.getString(4);
		    			String film= rs.getString(5);
		    			String date = rs.getString(6);
		    			
		    			//create object
		    			Asking u = new Asking(id,uname,uid,phone,film,date);
		    			up.add(u);
		    		}
		    		
		    	}
		    	catch(Exception e) {   //exception
		    		e.printStackTrace();
		    	}	
		    	return up;	
		    }
		 
		 
		 
		 
		 
		 
		 //deleteAsking Method
		 public boolean deleteAsking(String id) {
		    	
			 //convert String values to Integer
		    	int convId = Integer.parseInt(id);
		    	
		    	try {
		    		//database connection
		    		con = DBConnect.getConnection();
		    		stmt = con.createStatement();
		    		
		    		//delete database values
		    		String sql = "delete from asking where id='"+convId+"'";
		    		int r = stmt.executeUpdate(sql);
		    		
		    		if (r > 0) {
		    			isSuccess = true;
		    		}
		    		else {
		    			isSuccess = false;
		    		}
		    		
		    	}
		    	catch (Exception e) {
		    		e.printStackTrace(); //exception
		    	}
		    	
		    	return isSuccess;
		    
	
		 }
		 }




