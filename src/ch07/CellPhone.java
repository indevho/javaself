package ch07;

import lombok.Data;

@Data
public class CellPhone {
	// ������ ������ private 
	private String model ;
	private String color;
	private String message; // �����ȳ���.  THIS �޽����Դϴ�.
	
	
	public CellPhone() {};
	public CellPhone(String model, String color ) {
		
		
		
		
	}
	
	;
	
	
	  
		public void powerOn() {
			System.out.println("super �Ŀ��� ");
		}
		public void powerOff() {
			System.out.println("super �Ŀ����� ");
		}
		public void bell() {
			
			System.out.println("super bell");
		}
		public  void sendVoice(String message) {
			
			System.out.println("super sendVoice ��������:  "+ this.message);
			
			this.message = message;
			String thisMessage  = message;

			
			System.out.println("super sendVoice �������� :  "+ message);
		}
		public void receiveVoice(String message) {
			System.out.println("super rceive voce :"+message  );
			
		}
		
		public void hangUp() {
			System.out.println("super  hangeup() ");
		}
	
}
