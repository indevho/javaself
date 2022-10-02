package ch07;

public class DmbCellPhoneExample {

	
	// 실행할거라서 메인 있어야해요 .
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone() ;
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		
		
		
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("갤노트ㅇㅇ","검정 ") ;
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		
		
		
		
		// 생성  자식으로 , 변수형은 부모로 
		CellPhone dmbCellPhone3 = new DmbCellPhone() ;
		dmbCellPhone3.powerOn();
		dmbCellPhone3.powerOff();
		//dmbCellPhone3.getChannel();//no
		//The method getChannel() is undefined for the type CellPhone
		DmbCellPhone temp = (DmbCellPhone)dmbCellPhone3;
		temp.getChannel();// ok
		
		
		
		
		// 생성 부모ㅡ   변수형 자식( fail) 
		//DmbCellPhone dmbCellPhone4 = new CellPhone();//no
		//Type mismatch: cannot convert from CellPhone to DmbCellPhone
		
		
		
	}
	
	
	

}
