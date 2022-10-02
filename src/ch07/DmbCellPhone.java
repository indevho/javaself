package ch07;

import lombok.Data;

@Data
public class DmbCellPhone extends CellPhone {

	
	
	public DmbCellPhone() {super();};// 숨겨진 자식생성자..
	public DmbCellPhone(String model ,String color) {
		super(model,color);
	};
	
	public DmbCellPhone(String model ,String color, int channel) {
		super(model,color);// 생성자일떄 이줄은 위에 반드시 있어야함!! 
		//이 슈퍼를 주석처리 하면 불효자 
		this.channel = channel;
		this.setChannel(channel);
		// 메서드의 경우  super 가 아래에있어도 된다!! 
		
	};


	
	private int channel;
	
	
	
	
	String parentColor = super.getColor();
	
	
	
	
	


	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("자식dmb :파워온");
		//this.powerOn();
	}
	
	
}
