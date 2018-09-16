package practice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Associate;
import service.AssociateService;
import util.HibernateUtil;

public class Practice {

	public static void main(String[] args) {
		
//		SessionFactory sf = HibernateUtil.getSessionFactory();
		
//		Session sess = sf.openSession();
		
//		Associate a = new Associate();
//		
//		a.setName("mike");
//		a.setPoints(100);
//		

//		
//		sess.beginTransaction();		
//		sess.save(a);	
//		sess.getTransaction().commit();
//		
		
//		Criteria c = sess.createCriteria(Associate.class);			
		List associates = AssociateService.getAllAssociates();
		
		System.out.println(associates);

	}

}
