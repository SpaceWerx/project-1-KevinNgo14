package services;

import Models.Role;
import Models.User;

import repositories.UserDAO;

public class authService {
	//@SuppressWarnings("static-access")
	UserDAO ud = new UserDAO();
	public static User login(String username, String password) 
	{		
		try 
		{
			User user = UserDAO.getUserByUserName(username);
			if(user!=null && password.equals(user.getPassWord()) && user.getRole()== Role.MANAGER) 
			{
				System.out.println("Manager logged in Successfully");
				return user;
			}
			else if(user!=null && password.equals(user.getPassWord()) && user.getRole()== Role.EMPLOYEE) 
			{
				System.out.println("Employee logged in");
				return user;
			}
			else 
			{
				System.out.println("User does not exist");
				return null;
			}
			
		}
		catch(Exception e) 
		{
			System.out.println("Log in unsuccessful");
			e.printStackTrace();
		}
		return null;
	}
	public static int register(User userToBeRegistered) 
	{
		if(UserDAO.getUserByUserName(userToBeRegistered.getUserName())!= null)
		{
			throw new NullPointerException("Username is already taken");
		}
	
		return UserDAO.createUser(userToBeRegistered);
		
	}
}
