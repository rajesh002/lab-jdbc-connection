package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	ConnectionManager cm=new ConnectionManager();
	Connection con=cm.getConnection();
	
	System.out.println("Using Getconnection method");
	if(con!=null)
		System.out.println("======Connection Established=========\n");
	else
		System.out.println("Check your Connection");


	Properties prop=cm.loadPropertiesFile();
	System.out.println("Using Properties file");
	if(prop!=null)
		System.out.println("===========Connection Established=========");
	else
		System.out.println("Check your Connection");
	}
}
