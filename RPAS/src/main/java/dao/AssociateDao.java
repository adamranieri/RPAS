package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import entity.Associate;
import util.HibernateUtil;

public class AssociateDao implements IAssociate{

	public List<Associate> getAllAssociates() {
		
		Session sess = null;
	
		try {	
			
			sess = HibernateUtil.getSessionFactory().openSession();
			Criteria c = sess.createCriteria(Associate.class);			
			List associates = c.list();
			
			return associates;
		}
		catch(HibernateException e) {			
			e.printStackTrace();
				
		}finally {
			
			if(sess!=null) {
				sess.close();
			}
			
		}


		
		return null;
	}

	public boolean updateAssociate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAssociate() {
		// TODO Auto-generated method stub
		return false;
	}

}
