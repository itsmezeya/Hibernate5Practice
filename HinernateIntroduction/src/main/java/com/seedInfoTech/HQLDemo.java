package com.seedInfoTech;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLDemo {
	public static void main(String[] args) {
		
		Session session = Util.getSF().openSession();
		
		Query query = session.createQuery("from Product order by price desc");
		
		List<Product> products = query.list();
		
		for(Product product:products)
		{
			System.out.println(product);
		}
		session.close();
	}	

}
