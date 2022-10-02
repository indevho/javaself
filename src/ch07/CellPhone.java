package ch07;

import lombok.Data;

@Data
public class CellPhone {
	// 변수는 무조건 private 
	private String model ;
	private String color;
	private String message; // 에러안나죠.  THIS 메시지입니다.
	
	
	public CellPhone() {};
	public CellPhone(String model, String color ) {
		
		
		
		
	}
	
	;
	
	
	  
		public void powerOn() {
			System.out.println("super 파워온 ");
		}
		public void powerOff() {
			System.out.println("super 파워오프 ");
		}
		public void bell() {
			
			System.out.println("super bell");
		}
		public  void sendVoice(String message) {
			
			System.out.println("super sendVoice 전역변수:  "+ this.message);
			
			this.message = message;
			String thisMessage  = message;

			
			System.out.println("super sendVoice 지역변수 :  "+ message);
		}
		public void receiveVoice(String message) {
			System.out.println("super rceive voce :"+message  );
			
		}
		
		public void hangUp() {
			System.out.println("super  hangeup() ");
		}
	
}
