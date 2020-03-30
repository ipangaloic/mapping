package com.mapping.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mapping.entity.Person;



public class PersonReposiroty {
	
	private SessionFactory sessionFactory;
	
	public void Person(Person person) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(person);
		session.getTransaction().commit();
		session.close();
	}
	
	public Person getPersonById(Integer personId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Quer session.createQuery("select from Person p where p.PersonName=:PersonName");
		p.setParameter("personName", personName);
		session.close();
		
		if(person
		
	}
	
	
}

/*

	public DriverEntity getDriverById(int id) { 			//update updated
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		
		DriverEntity ce= (DriverEntity) session.get(DriverEntity.class,id);
		
		//Query query = session.createQuery("select c from CustomerEntity c where c.id =:id");
		//List<CustomerEntity> customer = query.list();

		session.getTransaction().commit();
		session.close();

		return ce;
	}

	public void update(DriverEntity c) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(c);
		session.getTransaction().commit();
		session.close();											//update ended
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}*/