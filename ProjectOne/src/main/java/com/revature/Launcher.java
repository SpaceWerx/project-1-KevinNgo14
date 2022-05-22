package com.revature;


import java.sql.Connection;
import java.sql.SQLException;

import services.menuService;
import utilities.ConnectionFactoryUtility;


public class Launcher {
	public static void main(String[] args){
		
		try(Connection conn = ConnectionFactoryUtility.getConnection())
		{
			System.out.println("Connection Successful!");
		}
		catch(SQLException e) 
		{
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		menuService menu = new menuService();
		menu.displayLogInMenu();
		
		
		
		
		
	}
	
}
