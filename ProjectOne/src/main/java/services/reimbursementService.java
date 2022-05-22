package services;

import java.util.ArrayList;
import java.util.List;

import Models.Reimbursement;
import Models.Role;
import Models.Status;
import Models.User;
import repositories.ReimbursementDAO;

public class reimbursementService {
	
	static ReimbursementDAO rDAO = new ReimbursementDAO();
	userService uService = new userService();
	
	public static List<Reimbursement> getPendingReimbursement()
	{
		return rDAO.getByStatus(Status.PENDING);
		
	}
	
	public static List<Reimbursement> getResolvedReimbursement()
	{
		List<Reimbursement> resolvedReimbursement = new ArrayList<Reimbursement>();
		
		resolvedReimbursement.addAll(rDAO.getByStatus(Status.APPROVED));
		resolvedReimbursement.addAll(rDAO.getByStatus(Status.DENIED));
		
		return resolvedReimbursement;
	}
	
	public static int submitReimbursement(Reimbursement reimbursementToBeSubmitted) 
	{
		User employee = userService.getUserById(reimbursementToBeSubmitted.getAuthor());
		
		if(employee.getRole() != Role.EMPLOYEE) 
		{
			throw new IllegalArgumentException("Managers can not submit reimbursement requests.");
			
		}
		else 
		{
			reimbursementToBeSubmitted.setStatus(Status.PENDING);
			
			return rDAO.create(reimbursementToBeSubmitted);
		}
	}
	
	public static Reimbursement update(Reimbursement unprocessedReimbursement, int resolverID, Status updatedStatus) 
	{
		User manager = userService.getUserById(resolverID);
		
		if(manager.getRole() != Role.MANAGER) 
		{
			throw new IllegalArgumentException("An employee can not process reimbursement requests.");
		}
		else 
		{
			unprocessedReimbursement.setResolver(resolverID);
			unprocessedReimbursement.setStatus(updatedStatus);
			
			rDAO.update(unprocessedReimbursement);
			
			return unprocessedReimbursement;
		}
	}
	
	public static Reimbursement getReimbursementById(int id) 
	{
		return rDAO.getReimbursementById(id);
	}
	
	public static List<Reimbursement> getReimbursementByAuthor(int userId)
	{
		return rDAO.getReimbursementsByUser(userId);
	}
	
	

}
