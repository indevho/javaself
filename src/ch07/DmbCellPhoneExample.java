package ch07;

public class DmbCellPhoneExample {

	
	// �����ҰŶ� ���� �־���ؿ� .
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone() ;
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		
		
		
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("����Ʈ����","���� ") ;
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		
		
		
		
		// ����  �ڽ����� , �������� �θ�� 
		CellPhone dmbCellPhone3 = new DmbCellPhone() ;
		dmbCellPhone3.powerOn();
		dmbCellPhone3.powerOff();
		//dmbCellPhone3.getChannel();//no
		//The method getChannel() is undefined for the type CellPhone
		DmbCellPhone temp = (DmbCellPhone)dmbCellPhone3;
		temp.getChannel();// ok
		
		
		
		
		// ���� �θ��   ������ �ڽ�( fail) 
		//DmbCellPhone dmbCellPhone4 = new CellPhone();//no
		//Type mismatch: cannot convert from CellPhone to DmbCellPhone
		
		
		
	}
	
	
	

}
