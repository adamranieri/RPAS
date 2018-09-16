package dao;

import java.util.List;

import entity.Associate;

public interface IAssociate {
	
	
	public List<Associate> getAllAssociates();
	public boolean updateAssociate();
	public boolean addAssociate();

}
