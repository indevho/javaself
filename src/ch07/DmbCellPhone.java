package ch07;

import lombok.Data;

@Data
public class DmbCellPhone extends CellPhone {

	
	
	public DmbCellPhone() {super();};// ������ �ڽĻ�����..
	public DmbCellPhone(String model ,String color) {
		super(model,color);
	};
	
	public DmbCellPhone(String model ,String color, int channel) {
		super(model,color);// �������ϋ� ������ ���� �ݵ�� �־����!! 
		//�� ���۸� �ּ�ó�� �ϸ� ��ȿ�� 
		this.channel = channel;
		this.setChannel(channel);
		// �޼����� ���  super �� �Ʒ����־ �ȴ�!! 
		
	};


	
	private int channel;
	
	
	
	
	String parentColor = super.getColor();
	
	
	
	
	


	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("�ڽ�dmb :�Ŀ���");
		//this.powerOn();
	}
	
	
}
