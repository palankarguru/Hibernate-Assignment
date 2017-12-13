package com.scp.Hihernate;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;

import antlr.collections.impl.LList;

public class CarList implements CarTypes {
	static SessionFactory sf;

	public static SessionFactory getSessionFactory() {
		if (sf == null)
			sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return sf;
	}

	public DemoCar getCarId(int id) {
		Session s = getSessionFactory().openSession();
		DemoCar d = (DemoCar) s.get(DemoCar.class, new Integer(id));
		s.close();
		return d;
	}

	public boolean addCar(DemoCar car) {
		Session s = getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.save(car);
		tx.commit();
		s.close();
		System.out.println("Added record Successfully........");
		return true;
	}

	public boolean deleteCar(int id) {
		Session s = getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		DemoCar d = (DemoCar) s.get(DemoCar.class, new Integer(id));
		s.delete(d);
		tx.commit();
		s.close();
		System.out.println("Deleted record Successfully........");
		return true;
	}

	public DemoCar updateCar(DemoCar car) {
		Session s = getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		DemoCar d = (DemoCar) s.get(DemoCar.class, new Integer(car.getId()));
		d.setName("Bugati");
		s.update(d);
		tx.commit();
		s.close();
		return null;
	}

	public List<DemoCar> getallCar() {
		Session s = getSessionFactory().openSession();
		// Transaction tx = s.beginTransaction();
		org.hibernate.Query q = s.createQuery("from DemoCar");;
		return q.list();
	}

	

	/*public DemoCar SearchCarByName(String sname) {
		Session s = getSessionFactory().openSession();
		// Transaction tx = s.beginTransaction();
		String hql = "from DemoCar d where d.name = sname";
		org.hibernate.Query q = (org.hibernate.Query) s.createQuery(hql);
		List<DemoCar> ls = q.list();
		
	//	Criteria c = s.createCriteria(Restrictions.eq(name, c ));
		for (DemoCar demo : ls) {
			System.out.println(demo);
		}
		return null;
		}*/
}
