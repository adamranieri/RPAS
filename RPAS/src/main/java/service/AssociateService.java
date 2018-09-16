package service;

import java.util.List;

import dao.AssociateDao;
import dao.IAssociate;
import entity.Associate;

public class AssociateService {

	public static List<Associate> getAllAssociates() {
		
		List<Associate> associates = new AssociateDao().getAllAssociates();

		return associates;
	}

	public static boolean updateAssociate() {

		return false;
	}

	public static boolean addAssociate() {

		return false;
	}

}
