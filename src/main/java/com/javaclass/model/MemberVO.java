package com.javaclass.model;

public class MemberVO {

	private String id;
	private int age;
	private String name;
	
	private boolean state;
	
	public boolean isState() { // 불린형의 get은 is
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	//-----------------------------------	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}
