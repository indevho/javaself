package com.test.ch06;

public abstract class Phone {

	public String owner ;
	
	public Phone(String  owner) {
		this.owner=  owner;
		
	}
	
	
	public void turnOn() {
		System.out.println("SUPER ON ");
	}
	
	public void turnOff() {
		System.out.println("SUPER off ");
	}
	
	public abstract void test();
	
}
