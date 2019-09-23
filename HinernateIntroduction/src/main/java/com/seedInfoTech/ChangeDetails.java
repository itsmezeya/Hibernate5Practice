package com.seedInfoTech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChangeDetails {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("config.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Product p = new Product();
		p.setPcode(112);
		p.setPname("XYZ");
		p.setPrice(650);
		Transaction tr = session.beginTransaction();
		
		session.update(p);
		tr.commit();
		
		session.close();
		System.out.println("Product modified successfully");

	}

}
