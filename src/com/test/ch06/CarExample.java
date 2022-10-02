package com.test.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		String company="";
		String model = "";
		//메서드 내에 있으므로 메서드변수 
		
		
		Car car = new Car();
		// 같은 패키지 이기때문에 바로 접근 가능해. 점으로 
		car.setCompany("현대");
		car.setModel("소나타");
		
		car.setCompany("기아");// 이걸 방지 하기 위해서 
		//캡슐화를 하도록한다.
		
		
		
		//System.out.print(car.company+ " , "+car.model + "\n");
		System.out.print(car.toString());
		
		
		Car car2 = new Car("KIA");
		
		System.out.println(car2.toString());
		
		Car car3 = new Car("tesla","TESLA Z","하양");
		
		System.out.println(car3.toString());
		
		//300
		car3.setMaxSpeed(249);
		System.out.println(car3.toString());
		
		//400
		car3.setMaxSpeed(250);
		System.out.println(car3.toString());
		
		String[] dueDateArr = new String[7];
		dueDateArr[0]= "06-01";
		// ... 7개? .. 힘들다. 
		// count 접근이 가능하다!! 
		String[] dueDateArr2 =
			{"06-01"
			,"07-01"
			,"08-01"
			,"09-01"
			,"10-01"
			,"11-01"
			,"02-01"};
		car3.setDueDate(dueDateArr2);
		
		// 납기 데이터에 대해서 , 가능여부 체크를 해주는 부분 필요
		
		
		
	}

}
