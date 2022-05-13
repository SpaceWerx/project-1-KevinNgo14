package services;

import java.util.ArrayList;
import java.util.List;

import Models.Reimbursement;
import Models.Status;
import mockData.*;

public class reimbursementService {
	List<Reimbursement> reimbursements = MockReimbursementData.getReimbursements();
	
	public void update(Reimbursement unprocessedReimbursement, int resolverId, Status updatedStatus)           
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
	
	public void submitReimbursement(Reimbursement reimbursmentToBeSubmitted) 
	{
		Reimbursement latestReimbursement = reimbursements.get(reimbursements.size()-1);
		int id = latestReimbursement.getId() + 1;
		
		reimbursmentToBeSubmitted.setId(id);
		reimbursmentToBeSubmitted.setStatus(Status.PENDING);
		reimbursements.add(reimbursmentToBeSubmitted);
	}
	public List<Reimbursement> getResolvedReimbursements()
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
	
	public List<Reimbursement> getPendingReimbursements()
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
	
	public Reimbursement getReimbursementById(int Id) 
	{
		for(Reimbursement reimbursement : reimbursements) 
		{
			if(reimbursement.getId() == Id) 
			{
				return reimbursement;
			}
		}
		return null;
	}
	
	public List<Reimbursement> getReimbursementByAuthor(int userId)
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
