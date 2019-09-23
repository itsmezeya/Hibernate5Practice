package com.seedInfoTech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveProduct {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("config.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Product p = new Product();
		p.setPcode(113);
		Transaction tr = session.beginTransaction();
		
		session.delete(p);
		tr.commit();
		
		session.close();
		System.out.println("Product removed successfully");

	}

}
