package com.revature.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


// This is just a bean, however, once I map it it becomes a persistant class
// there are 2 ways to map a persistanr class
// 1) the annoying way using hibernate mapping files and
// 2) the easy way TBC
@Entity
@Table(name="Person")
public class Person {
	@Id
	@Column(name = "p_id")
	@SequenceGenerator(sequenceName = "MY_SEQ", name = "JAVA_NAME")
	@GeneratedValue(generator = "JAVA_NAME", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String title;
	private Integer salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", title=" + title + ", salary=" + salary + "]";
	}
	public Person(Integer id, String name, String title, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	
	public Person( String name, String title, Integer salary) {
		super();
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
