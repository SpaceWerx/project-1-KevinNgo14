package controller;

import java.util.Objects;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import Models.Role;
import Models.User;
import io.javalin.http.Handler;
import io.javalin.http.HttpCode;
import repositories.UserDAO;
import services.authService;

public class AuthController
{
	authService as = new authService();
	User currentUser;
	public static int CurrentUser;
	public Handler handleLogin =(ctx) -> 
	{
		String body = ctx.body();
		Gson gson = new Gson();
		User user = gson.fromJson(body, User.class);
		currentUser = UserDAO.getUserByUserName(user.getUserName());

		if(currentUser != null)
		{ 		
			ctx.sessionAttribute("currentUser",currentUser.getUser_ID());
		
			CurrentUser = ctx.sessionAttribute("currentUser");
		}
		if(as.login(user.getUserName(), user.getPassWord()) != null) 
		{
			if(currentUser.getRole() == Role.EMPLOYEE) 
			{
				ctx.status(202);
				ctx.result("Log in sucessful");
				System.out.println("Employee");
			}
			else if(currentUser.getRole() == Role.MANAGER) 
			{
				ctx.status(201);
				ctx.result("Log in successful");
				System.out.println("Manager");
			}
			else 
			{
				ctx.status(HttpCode.BAD_REQUEST);
				ctx.result("Invalid Credentials");
			}
		}
	};
	
	public Handler handleRegister=(ctx)-> 
	{
		try 
		{
			String input = ctx.body();
			
			ObjectMapper mapper = new ObjectMapper();
			User user = mapper.readValue(input, User.class);
			
			int id = authService.register(user);
			
			if(id == 0) 
			{
				ctx.status(HttpCode.INTERNAL_SERVER_ERROR);
				ctx.result("Registration unsuccessful");
			}
			else 
			{
				ctx.status(HttpCode.CREATED);
				ctx.result("Registration successful.");
			}
		}
		catch(Exception e) 
		{
			ctx.status(HttpCode.INTERNAL_SERVER_ERROR);
			
			if(!e.getMessage().isEmpty()) 
			{
				ctx.result(e.getMessage());
			}
			e.printStackTrace();
		}
	};
}
	


