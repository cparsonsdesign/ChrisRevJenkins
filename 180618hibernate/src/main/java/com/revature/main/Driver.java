package com.revature.main;

import com.revature.beans.Person;
import com.revature.daos.PersonDaoImpl;

public class Driver {

	public static void main(String[] args) {
		System.out.println("============== Launching App ====");
		PersonDaoImpl pd = new PersonDaoImpl();
		
		pd.insertPerson(new Person( "Bobbert", "Profeesional Bob", 1000));
		pd.insertPerson(new Person( "Ryan", "Lead Trainer", -16));
		pd.insertPerson(new Person( "Mahrab", "Lead Trainer", 10));
		
		
		
		
		System.out.println("============== Terminating App ====");
		System.exit(0);
	}

}
