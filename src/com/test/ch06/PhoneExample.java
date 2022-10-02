package com.test.ch06;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone("ffff");
		//Cannot instantiate the type Phone 
		// 추상이라 x  즉 new 로 뭘 하려고 하면 당ㅇ연히안된다
		
	SmartPhone sp = new SmartPhone("sasd");
	Phone p =sp;
	Phone p2 =  new SmartPhone("asdf2222");
		
	
	
	
	
	
	
		
	}
}
