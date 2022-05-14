package services;

import java.util.ArrayList;
import java.util.List;

import Models.Reimbursement;
import Models.Status;
import mockData.*;

public class reimbursementService {
	static List<Reimbursement> reimbursements = MockReimbursementData.getReimbursements();
	
	public static void update(Reimbursement unprocessedReimbursement, int resolverId, Status updatedStatus)           
	{
		for(Reimbursement reimbursement: reimbursements) 
		{
			if(reimbursement.getId() == unprocessedReimbursement.getId()) 
			{
				reimbursement.setResolver(resolverId);
				reimbursement.setStatus(updatedStatus);
				return;
			}
		}
		throw new RuntimeException("There was an error processing this reimbursement, please try again");
	}
	
	public static void submitReimbursement(Reimbursement reimbursmentToBeSubmitted) 
	{
		Reimbursement latestReimbursement = reimbursements.get(reimbursements.size()-1);
		int id = latestReimbursement.getId() + 1;
		
		reimbursmentToBeSubmitted.setId(id);
		reimbursmentToBeSubmitted.setStatus(Status.PENDING);
		reimbursements.add(reimbursmentToBeSubmitted);
	}
	public static List<Reimbursement> getResolvedReimbursements()
	{
		List<Reimbursement> resolvedReimbursements = new ArrayList<Reimbursement>();
		for (Reimbursement reimbursement : reimbursements) 
		{
			if(reimbursement.getStatus() == Status.APPROVED ||reimbursement.getStatus() == Status.DENIED) 
			{
				resolvedReimbursements.add(reimbursement);
			}
		}
		return resolvedReimbursements;
	}
	
	public static List<Reimbursement> getPendingReimbursements()
	{
		List<Reimbursement> pendingReimbursements = new ArrayList<Reimbursement>();
		for (Reimbursement reimbursement : reimbursements) 
		{
			if(reimbursement.getStatus() == Status.PENDING) 
			{
				pendingReimbursements.add(reimbursement);
			}
		}
		return pendingReimbursements;
	}
	
	public static Reimbursement getReimbursementById(int[] selection) 
	{
		for(Reimbursement reimbursement : reimbursements) 
		{
			for(int i = 0 ; i <selection.length; i++) 
			{
				if(selection[i] == reimbursement.getId()) 
				{
					return reimbursement;
				}
			}
		}
		return null;
	}
	
	public static List<Reimbursement> getReimbursementByAuthor(int userId)
	{
		List<Reimbursement> userReimbursement = new ArrayList<Reimbursement>();
		
		for(Reimbursement r: reimbursements) 
		{
			if(r.getAuthor() == userId || r.getResolver() == userId) 
			{
				userReimbursement.add(r);
			}
		}
		return userReimbursement;
	}

}
