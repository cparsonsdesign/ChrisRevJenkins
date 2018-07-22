package com.revature.beans;

public class Shop {
	private Integer id;
	private String name;
	private Integer ownerId;
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
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", ownerId=" + ownerId + "]";
	}
	public Shop(Integer id, String name, Integer ownerId) {
		super();
		this.id = id;
		this.name = name;
		this.ownerId = ownerId;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
