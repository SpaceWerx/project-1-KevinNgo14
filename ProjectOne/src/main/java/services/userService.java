package services;

import java.util.ArrayList;
import java.util.List;

import Models.*;

public class userService {
	
	static List<User> users = new ArrayList<User>();
	
	
	public static User getUserById(int author) 
	{
		for(User user : users) 
		{
			if(user.getUser_ID() == author ) 
			{
				return user;
			}
		}
		return null;
	}
	
	public static List<User> getByRole(Role role) 
	{
		for(User user :users) 
		{
			if(user.getRole() == role) 
			{
				users.add(user);
			}
		}
		return users;
		
	}
	public User getUserByUserName(String username) 
	{
		for(User user : users) 
		{
			if(user.getUserName().equals(username)) 
			{
				return user;
			}
		}
		return null;
	}
	
	public List<User> getAllUsers(List<User> users)
	{
		return users;
	}
	
	public void idExists(int id) 
	{
		for(User user : users) 
		{
			if(user.getUser_ID() == id) 
			{
				System.out.println("This ID exists already");
				break;
			}
		}
	}
	
}
