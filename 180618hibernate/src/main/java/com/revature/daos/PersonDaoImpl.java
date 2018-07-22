package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.Person;
import com.revature.util.HibernateUtil;

public class PersonDaoImpl {
	
	public Integer insertPerson(Person person)
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		Integer id = null;
		
		try {
			tx = session.beginTransaction();
			id = (Integer)session.save(person);
			tx.commit();
		} catch (Exception e) {
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		 return id;
	}
	
	public List<Person> getAllPersons()
	{
		List<Person> persons = null;
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			persons = session.createQuery("FROM Person").list();
			tx.commit();
		} catch (Exception e) {
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		 return persons;
	}
	
	public Person updatePersonById(Person p)
	{
		Person person = null;
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			person = (Person)session.get(Person.class, p.getId);
			if(person!=null)
			{
				if(person.getName() != null)
				{
					person.setName(p.getName());
				}
			}
			tx.commit();
		} catch (Exception e) {
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		 return persons;
	}

}
