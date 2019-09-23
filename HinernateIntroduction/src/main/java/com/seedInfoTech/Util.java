package com.seedInfoTech;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	
	static SessionFactory getSF()
	{
		Configuration config = new Configuration().configure("config.xml");
		SessionFactory sf = config.buildSessionFactory();
		return sf;
	}

}
