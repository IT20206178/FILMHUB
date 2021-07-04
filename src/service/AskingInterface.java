package service;

import java.util.List;

import model.Asking;

public interface AskingInterface{
	
	public boolean validate(String uname, String uid);
	
	
	public List <Asking> getAsking(String uname1);
	
	
	public  boolean insertAsking(String uname, String uid, String phone, String film, String date);
	
	
	public boolean updateAsking1(String id, String uname, String uid, String phone, String film, String date);
	
	
	public List<Asking> getAskingDetails(String Id);
	
	
	public boolean deleteAsking(String id);
	
	
	
	
}