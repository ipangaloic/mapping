package com.mapping.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapping.entity.Person;
import com.mapping.repository.PersonRepository;

public class MainApp {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");

		PersonRepository crs = (PersonRepository) act.getBean("personRepository");

		System.out.println("Select by id = 2");				
		
		//update method
		
		Person p1 = crs.getPersonById(2);
		
		//nouveau code
		p1.setName("Professor");

		crs.update(p1);
		
	}*/

	public static void main(String[] args) {
AnnotationConfiguration config = new AnnotationConfiguration();
config.addAnnotatedClass(Person.class);
config.addAnnotatedClass(PersonDetail.class);
config.configure("hibernate.cfg.xml");

new SchemaExport(config).create(true, true);

SessionFactory factory = config.buildingSessionFactory();
Session session = factory.getCurrentSession();
session.beginTransaction();
}
}