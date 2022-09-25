package com.test.ch06;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Car {
	//필드
	// 퍼블릭도 안써져있으면 접근 제어자  protected 
	// 접근제어가 제일중요. 메서드는 기본적으로 계속 활용하기 용이해야하므로 public 으로 
		/// return할 자료형 
	// protected 는 패키지 내에서만 서로 접근 가능하다는 의미이다. 
	private String company = "현대자동차";
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;
	private int price;
	
	// 납기 배열 
	private String[] dueDate;
	private String realDate;
	
	static int count =  0  ;// 외부에서도 접근이가능하고, 수정도 가능



	public String[] getDueDate() {
		
		
		
		
		
		
		return this.dueDate;
	}
 
	public void setDueDate(String[] dueDate) {
//		ArrayList list = new ArrayList();
//		list.size();
		
		//외부순환방식
		for (int i = 0; i < dueDate.length; i++) {
			// 보통은 size 란 메서드를 쓰지만 배열의경우 length 라는 속성을 
			//구조적으로 가지고있다. 배열은 객체가 아니기 때문에..
			//this.dueDate[i] = dueDate[i];			
		}// 몇번째 순값을 빼낸다.

		
		switch(count) {
		case 1:
			this.realDate = dueDate[0];
			break;
		case 2:
			this.realDate = dueDate[1];
			break;
			
		case 3:
			this.realDate = dueDate[2];
			break;
		case 4:
			this.realDate = dueDate[3];
			break;
		case 5:
			this.realDate = dueDate[4];
			break; 
		}
		
		
		
		
		//내부순환방식  
		for(String string : dueDate) {
			//10명이 요청 했다. 
			// 그러면 dueDate 는  1명 선택시에 제일 빠른날짜로 가능 
			// 
			
		}// 값을 빼내는게 이미 있고 , 그걸 할당한다 
		
		
		
		this.dueDate = dueDate;
	}



	@Override
	public String toString() {
		String returnVal = "";
		returnVal = "회사 : "+ this.company +"\n 모델 : "+ this.model
		+"\n 색깔 : "+ this.color + ",\n  "+this.maxSpeed + ",\n  " +this.speed +
		"\n price : "+ this.price +
		"\n count : "+ this.count +
		"\n realDate : "+ this.realDate +
		"\n ---END----\n";
		return returnVal;
	}
	
	
	
	public Car() {
		count ++;
	}// 반환 타입이 없다. 생성자의 특징.
	
	public Car(String company) {
		count ++;
		this.company = company;
		//this(company, "","",0,0);
	}// 오버 로딩한 생성자이다. 
	
	public Car(String company, String color) {
		//this(company, "", color, 0, 123);
		this.company = company;
		this.color= color;
		count ++;
	}
	
	public Car(String company, String color, int maxSpeed ) {
		//this(company, "", color, maxSpeed, 123);
		//this.setMaxSpeed(maxSpeed);
		this.company = company;
		this.color= color;
		this.maxSpeed = maxSpeed;
		count ++;
	}
	
	//car3
	public Car(String company,String model, String color ) {
		System.out.println("3개짜리str생성자실행");
		this.company = company;
		this.model = model;
		this.color = color; 
		count ++;
		
	}	
	
	
	
	public Car(String company,String model, String color , int maxSpeed, int speed) {
		System.out.println("wide 생성자실행");
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		
	}
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		decisionPriceCase(maxSpeed);
		this.maxSpeed = maxSpeed;
	}
	
	
	private void decisionPrice(int maxSpeed) {
		
		System.out.println("maxSpeed세팅한다 :"+maxSpeed);
		if( maxSpeed <150 ) {
			this.price = 1000;
		}else if( maxSpeed < 200 ){
			this.price = 2000;
		}else if( maxSpeed < 250 ){
			this.price = 3000;		
		}else {
			this.price = 0;
		}

	}
	
	
	
	private void decisionPriceCase(int maxSpeed) {
		switch ( maxSpeed) {
		case 100 :
			this.price = 500;
			break;
		case 150 :
			this.price = 1000;
			break;
		case 200 :
			this.price = 1500;
			break;
		case 250 :
			this.price = 2000;
			break;
			
		case 300 :
			this.price = 2500;
			break;

		default:
			this.price =0;
			break;
		}
		
		
		
		
		
	}
	
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
