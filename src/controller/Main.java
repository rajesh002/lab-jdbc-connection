package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	ConnectionManager cm=new ConnectionManager();
	Connection con=cm.getConnection();
	
	
	if(con!=null)
		System.out.println("Connection Established");
	else
		System.out.println("Check your Connection");
	}
}
