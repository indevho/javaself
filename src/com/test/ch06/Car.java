package com.test.ch06;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Car {
	//�ʵ�
	// �ۺ��� �Ƚ��������� ���� ������  protected 
	// ������� �����߿�. �޼���� �⺻������ ��� Ȱ���ϱ� �����ؾ��ϹǷ� public ���� 
		/// return�� �ڷ��� 
	// protected �� ��Ű�� �������� ���� ���� �����ϴٴ� �ǹ��̴�. 
	private String company = "�����ڵ���";
	private String model = "�׷���";
	private String color = "����";
	private int maxSpeed = 350;
	private int speed;
	private int price;
	
	// ���� �迭 
	private String[] dueDate;
	private String realDate;
	
	static int count =  0  ;// �ܺο����� �����̰����ϰ�, ������ ����



	public String[] getDueDate() {
		
		
		
		
		
		
		return this.dueDate;
	}
 
	public void setDueDate(String[] dueDate) {
//		ArrayList list = new ArrayList();
//		list.size();
		
		//�ܺμ�ȯ���
		for (int i = 0; i < dueDate.length; i++) {
			// ������ size �� �޼��带 ������ �迭�ǰ�� length ��� �Ӽ��� 
			//���������� �������ִ�. �迭�� ��ü�� �ƴϱ� ������..
			//this.dueDate[i] = dueDate[i];			
		}// ���° ������ ������.

		
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
		
		
		
		
		//���μ�ȯ���  
		for(String string : dueDate) {
			//10���� ��û �ߴ�. 
			// �׷��� dueDate ��  1�� ���ýÿ� ���� ������¥�� ���� 
			// 
			
		}// ���� �����°� �̹� �ְ� , �װ� �Ҵ��Ѵ� 
		
		
		
		this.dueDate = dueDate;
	}



	@Override
	public String toString() {
		String returnVal = "";
		returnVal = "ȸ�� : "+ this.company +"\n �� : "+ this.model
		+"\n ���� : "+ this.color + ",\n  "+this.maxSpeed + ",\n  " +this.speed +
		"\n price : "+ this.price +
		"\n count : "+ this.count +
		"\n realDate : "+ this.realDate +
		"\n ---END----\n";
		return returnVal;
	}
	
	
	
	public Car() {
		count ++;
	}// ��ȯ Ÿ���� ����. �������� Ư¡.
	
	public Car(String company) {
		count ++;
		this.company = company;
		//this(company, "","",0,0);
	}// ���� �ε��� �������̴�. 
	
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
		System.out.println("3��¥��str�����ڽ���");
		this.company = company;
		this.model = model;
		this.color = color; 
		count ++;
		
	}	
	
	
	
	public Car(String company,String model, String color , int maxSpeed, int speed) {
		System.out.println("wide �����ڽ���");
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
		
		System.out.println("maxSpeed�����Ѵ� :"+maxSpeed);
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
