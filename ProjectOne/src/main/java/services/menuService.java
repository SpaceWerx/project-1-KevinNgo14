package services;

import java.util.List;
import java.util.Scanner;

import Models.Reimbursement;
import Models.Role;
import Models.Status;
import Models.User;
import Models.reimbursementType;

public class menuService {
	public void displayMenu() 
	{
		boolean menuOptions = true;
		
		System.out.println("------------------------------------------------");
		System.out.println("Welcome to the Revature Reimbursement System");
		System.out.println("------------------------------------------------");
		System.out.println();
		
		while(menuOptions) 
		{
			System.out.println("PLEASE ENTER YOUR NUMBER OF CHOICE");
			System.out.println("1 -> Employee Portal");
			System.out.println("2 -> Finance Manger Portal");
			System.out.println("0-> Exit Application");
			
			int firstChoice = promptSelection();
			switch(firstChoice) 
			{
				case 1:
					System.out.println("Inside Employee");
					break;
				case 2:
					System.out.println("Inside Manager");
					break;
				case 0:
					System.out.println("exit");
					menuOptions = false;
			}
		}
		
	}
	
	public void displayFinanceManagerMenu(User manager) 
	{
		boolean managerPortal = true;
		System.out.println("------------------------------------------------");
		System.out.println("Welcome to the Manager Processing Portal," + manager.getUserName());
		System.out.println("------------------------------------------------");
		System.out.println();
		
		while(managerPortal) 
		{
			System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
			System.out.println("1 -> View all Pending Reimbursements");
			System.out.println("2 -> View all Resolved Reimbursements");
			System.out.println("3 -> Process a Reimbursement");
			System.out.println("0 -> Return to Main Menu");
			
			int firstChoice = promptSelection(...validEntries);
			
			switch(firstChoice) 
			{
				case 1:
					displayPendingReimbursements();
					break;
				case 2:
					displayResolvedReimbursements();
					break;
				case 3:
					processReimbursement(manager);
					break;
				case 0:
					System.out.println("Returning to Main Menu...");
					managerPortal = false;
					break;
			}
		}
	}
	
	public void displayEmployeeMenu(User employee) 
	{
		boolean employeePortal = true;
		System.out.println("------------------------------------------------");
		System.out.println("Welcome to the Employee Portal," + employee.getUserName());
		System.out.println("------------------------------------------------");
		System.out.println();
		
		while(employeePortal) 
		{
			System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
			System.out.println("1 -> View Previous Requests");
			System.out.println("2 -> Submit a Reimbursement");
			System.out.println("0 -> Return to Main Menu");
		}
		int firstChoice = promptSelection(...validEntries: 1,2,0);
		
		switch(firstChoice) 
		{
			case 1: 
				displayPreviousRequests(employee);
				break;
			case 2:
				submitReimbursement(employee);
				break;
			case 0:
				System.out.println("Returning to Main Menu...");
				employeePortal = false;
				break;
		}
		
	}
	public int promptSelection(int ...validEntries) 
	{
		int input;
		boolean valid = false;
		
		do 
		{
			input = parseIntegerInput(fetchInput());
			for (int entry : validEntries) 
			{
				if(entry == input) 
				{
					valid = true;
					break;
				}
				
			}
			if(!valid) 
			{
				System.out.println("Input recieved was not a valid option, please try again");
			}
		}
		while(!valid);
		return input;
	}
	
	public String fetchInput() 
	{
		return scan.nextLine().split(" ")[0];
	}
	public int parseIntegerInput(String input) 
	{
		try 
		{
			return Integer.parseInt(input);
		}
		catch(NumberFormatException e)
		{
			System.out.println("The input was malformed, please try again");
			return -1;
		}
	}
	public double parseDoubleInput(String input) 
	{
		try 
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			System.out.println("The input was malformed, please try again");
			return -1;
		}
	}
	public void submitReimbursement(User employee) 
	{
		Reimbursement reimbursementToBeSubmitted = new Reimbursement();
		reimbursementToBeSubmitted.setAuthor(employee.getUser_ID());
		
		System.out.println("What type of reimbursement would you like to submit?");
		System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
		System.out.println("1 -> Lodging");
		System.out.println("2 -> Travel");
		System.out.println("3 -> Food");
		System.out.println("4 -> Other");
		
		int typeDecision = promptSelection(...validEntries:1,2,3,4);
		
		switch(typeDecision) 
		{
			case 1: 
				reimbursementToBeSubmitted.setType(reimbursementType.LODGING);
				break;
			case 2:
				reimbursementToBeSubmitted.setType(reimbursementType.TRAVEL);
				break;
			case 3:
				reimbursementToBeSubmitted.setType(reimbursementType.FOOD);
				break;
			case 4:
				reimbursementToBeSubmitted.setType(reimbursementType.OTHER);
				break;
		}
		
		System.out.println("Please enter the dollar amount you are requesting to be reimbursed: ");
		System.out.println("$");
		
		reimbursementToBeSubmitted.setAmount(parseDoubleInput(fetchInput()));
		
		if(reimbursementToBeSubmitted.getAmount() <= 0) 
		{
			System.out.println("Invalid Amount has been entered, please enter a correct dollar amount.");
			boolean valid = false;
			while(!valid) 
			{
				reimbursementToBeSubmitted.setAmount(parseDoubleInput(fetchInput()));
				if(reimbursementToBeSubmitted.getAmount() != 0) 
				{
					valid = true;
				}
			}
		}
		
		System.out.println("Please enter a description/reason for your reimbursement request.");
		reimbursementToBeSubmitted.setDescription(scan.nextLine());
		if(reimbursementToBeSubmitted.getDescription().trim().equals("")) 
		{
			System.out.println("You can't submit a request with an empty description, please explain the reason for"
					+ "your request");
			boolean valid = false;
			while(!valid) 
			{
				reimbursementToBeSubmitted.setDescription(scan.nextLin());
				if(!reimbursementToBeSubmitted.getDescription().trim().equals("")) 
				{
					valid = true;
				}
			}
		}
		rService.submitReimbursement(reimbursementToBeSubmitted);
		
		
	}
	public void processReimbursement(User MANAGER) 
	{
		boolean processPortal = true;
		System.out.println("------------------------------------------------");
		System.out.println("Welcome to the Manager Processing Portal," + MANAGER.getUserName());
		System.out.println("------------------------------------------------");
		System.out.println();
		
		while(processPortal) 
		{
			List<Reimbursement> reimbursements = rService.getPendingReimbursements();
			if(reimbursements.isEmpty()) 
			{
				System.out.println("There are no reimbursements to process.");
				System.out.println("Returning to the main menu");
				return;
			}
			
			int[]ids = new int [reimbursements.size()];
			for(int i = 0; i<reimbursements.size(); i++) 
			{
				Reimbursement r = reimbursements.get(i);
				User author = userService.getUserById(r.getAuthor());
				System.out.println(r.getId()+"->" + author.getUserName() + " : $" + r.getAmount());
				ids[i]= r.getId();
			}
			
			System.out.println("please enter the ID of the Reimbursement you wish to process");
			
			int selection = promptSelection(ids);
			Reimbursement reimbursementToBeProcessed = rService.getReimbursementById(selection);
			System.out.println("Processinhg reimbursement #" + reimbursementToBeProcessed.getId());
			System.out.println("Details\nAuthor: " 
					+userService.getUserById(reimbursementToBeProcessed.getAuthor()).getUsername() 
					+"\nAmount: " + reimbursementToBeProcessed.getAmount()
					+"\nDescription: " + reimbursementToBeProcessed.getDescription()
			);
			
			System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
			System.out.println(" 1 -> Approve");
			System.out.println("2 -> Deny");
			
			int decision = promptSelection(...validEntries: 1,2);
			Status status = (decision == 1 )? Status.APPROVED : Status.DENIED;
			rService.update(reimbursementToBeProcessed, MANAGER.getUser_ID(), status);
			
			System.out.println("Would you like to process another reimbursement?");
			System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
			System.out.println("1 -> Yes");
			System.out.println("2 -> No");
			
			int lastChoice = promptSelection(...validEntries: 1,2);
			if (lastChoice == 2) 
			{
				processPortal = false;
			}
			
		}
		
	}
	
	public void handlePortal(Role role) 
	{
		List<User> users = userService.getByRole(role);
		
		int[] ids = new int[users.size() + 1];
		id[users.size()] = 0;
		for (int i  = 0; i < users.size(); i++) 
		{
			ids[i] = users.get(i).getUser_ID();
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("PLEASE ENTER THE NUMBER OF YOUR CHOICE");
		
		for(User u : users) 
		{
			System.out.println(u.getId()+ "->" + u.getUserName());
		}
		System.out.println("0 -> Return to Main Menu");
		System.out.println();
		
		int userChoice = promptSelection(ids);
		
		if(userChoice == 0) 
		{
			return;
		}
		User employee = userService.getUserById(userChoice);
		
		if(role == Role.MANAGER) 
		{
			System.out.println("Opening Manager Portal for" + employee.getUserName());
			displayFinanceManagerMenu(employee);
		}
		else 
		{
			System.out.println("Opening Employee Portal for " + employee.getUserName());
			displayEmployeeMenu(employee);
		}
	}
	
	public void displayPendingReimbursements() 
	{
		List<Reimbursement> pendingReimbursements = rService.getPendingReimbursements();
		
		if(pendingReimbursemnts.isEmpty()) 
		{
			System.out.println("No pending Requests...");
			System.out.println("Returning to Previous Menu...");
		}
		for(Reimbursement r : pendingReimbursements) 
		{
			System.out.println(r);
		}
	}
	
	public void displayResolvedReimbursements() 
	{
		List<Reimbursement> resolvedReimbursements = rService.getResolvedReimbursements();
		
		if(resolvedReimbursemnts.isEmpty()) 
		{
			System.out.println("No Resolved Requests...");
			System.out.println("Returning to Previous Menu...");
		}
		for(Reimbursement r : resolvedReimbursements) 
		{
			System.out.println(r);
		}
	}
	public void displayPreviousRequests(User employee) 
	{
		List<Reimbursement> reimbursements = rService.getReimbursementsByAuthor(employee.getUser_ID());
		
		if(reimbursements.isEmpty()) 
		{
			System.out.println("No Previous Requests...");
			System.out.println("Returning to Previous Menu...");
			
		}
		for(Reimbursement r : reimbursements) 
		{
			System.out.println(r);
		}
	}
	
	

}
