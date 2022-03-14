package com.tut.HibernateAnnotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	private static SessionFactory sf;

	public static SessionFactory getInstance()
	{
		try {
			sf=new Configuration().configure().buildSessionFactory();
			
		} catch (Throwable e) {
			System.err.println("object not created........"+e);
			throw new ExceptionInInitializerError(e);
		}
		return sf;
	}

}
