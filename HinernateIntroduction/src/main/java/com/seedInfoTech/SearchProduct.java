package com.seedInfoTech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchProduct {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("config.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
				
		Product product = session.get(Product.class,112);
		System.out.println(product.getPcode());
		System.out.println(product.getPname());
		System.out.println(product.getPrice());
				
		session.close();
		System.out.println("Product searched successfully");

	}

}
