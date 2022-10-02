package ch07car;

import lombok.Data;

@Data
public class Tire {

	private int maxRotation;// 최대회전수
	private int accumulatedRotation;// 누적ㅅ회전수
	private String location;// 타이어의 위치

	public void checkRotation() {
		if (accumulatedRotation >= maxRotation) {
			System.out.println("펑");
		}
	}
	
	public Tire(String location , String maxRotation) {
	   this.location = location;
	   this.maxRotation= Integer.parseInt(maxRotation);
	   //그냥하면 - Type mismatch: cannot convert from String to int
		
	}
	
	public boolean roll() {
		//this.accumulatedRotation= 0; 이건 문제가 아니었음..
		++this.accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			
			System.out.println("타이어 정상 ,, location : "+location
					+ " 사용량/한계 :"+accumulatedRotation + "/"+maxRotation);
			return true;
		}else {
			
			System.out.println("타이어 펑크 ,, location : "+location
					+ " 사용량/한계 :"+accumulatedRotation + "/"+maxRotation);
			return false;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
