package ch07car;

import lombok.Data;

@Data
public class Tire {

	private int maxRotation;// �ִ�ȸ����
	private int accumulatedRotation;// ������ȸ����
	private String location;// Ÿ�̾��� ��ġ

	public void checkRotation() {
		if (accumulatedRotation >= maxRotation) {
			System.out.println("��");
		}
	}
	
	public Tire(String location , String maxRotation) {
	   this.location = location;
	   this.maxRotation= Integer.parseInt(maxRotation);
	   //�׳��ϸ� - Type mismatch: cannot convert from String to int
		
	}
	
	public boolean roll() {
		//this.accumulatedRotation= 0; �̰� ������ �ƴϾ���..
		++this.accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			
			System.out.println("Ÿ�̾� ���� ,, location : "+location
					+ " ��뷮/�Ѱ� :"+accumulatedRotation + "/"+maxRotation);
			return true;
		}else {
			
			System.out.println("Ÿ�̾� ��ũ ,, location : "+location
					+ " ��뷮/�Ѱ� :"+accumulatedRotation + "/"+maxRotation);
			return false;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
