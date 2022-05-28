package controller;

import java.util.Objects;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import Models.User;
import io.javalin.http.Handler;
import io.javalin.http.HttpCode;
import services.authService;

public class AuthController
{
	authService as = new authService();
	public Handler handleLogin =(ctx) -> 
	{
		String body = ctx.body();
		Gson gson = new Gson();
		User user = gson.fromJson(body, User.class);
		int login = as.login(user.getUserName(), user.getPassWord());
		
		if(login == 1)
		{
			ctx.status(HttpCode.ACCEPTED);
			ctx.result("Managed succesful log in");
		}
		else if(login == 2 ) 
		{
			ctx.status(HttpCode.ACCEPTED);
			ctx.result("Employee succesful log in");
		}
		else 
		{
			ctx.status(HttpCode.BAD_REQUEST);
			ctx.result("Invalid Credentials");
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
	


