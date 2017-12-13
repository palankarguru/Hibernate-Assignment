/*package com.scp.Hihernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static Session sf = null;

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			sf = (Session) new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return (SessionFactory) sf;
	}

}
*/