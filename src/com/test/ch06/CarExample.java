package com.test.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		String company="";
		String model = "";
		//�޼��� ���� �����Ƿ� �޼��庯�� 
		
		
		Car car = new Car();
		// ���� ��Ű�� �̱⶧���� �ٷ� ���� ������. ������ 
		car.setCompany("����");
		car.setModel("�ҳ�Ÿ");
		
		car.setCompany("���");// �̰� ���� �ϱ� ���ؼ� 
		//ĸ��ȭ�� �ϵ����Ѵ�.
		
		
		
		//System.out.print(car.company+ " , "+car.model + "\n");
		System.out.print(car.toString());
		
		
		Car car2 = new Car("KIA");
		
		System.out.println(car2.toString());
		
		Car car3 = new Car("tesla","TESLA Z","�Ͼ�");
		
		System.out.println(car3.toString());
		
		//300
		car3.setMaxSpeed(249);
		System.out.println(car3.toString());
		
		//400
		car3.setMaxSpeed(250);
		System.out.println(car3.toString());
		
		String[] dueDateArr = new String[7];
		dueDateArr[0]= "06-01";
		// ... 7��? .. �����. 
		// count ������ �����ϴ�!! 
		String[] dueDateArr2 =
			{"06-01"
			,"07-01"
			,"08-01"
			,"09-01"
			,"10-01"
			,"11-01"
			,"02-01"};
		car3.setDueDate(dueDateArr2);
		
		// ���� �����Ϳ� ���ؼ� , ���ɿ��� üũ�� ���ִ� �κ� �ʿ�
		
		
		
	}

}
