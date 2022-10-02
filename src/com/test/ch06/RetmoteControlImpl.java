package com.test.ch06;

import java.rmi.Remote;

public class RetmoteControlImpl implements RemoteControl {
	
	
	
	private int volume;
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("구현체impl  켭니다.");
	}

	@Override
	public void turOn() {
		// TODO Auto-generated method stub
		System.out.println("구현체impl  껍니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("구현체impl  볼륨다 :"+ volume);
		
		if( volume >RemoteControl.MAX_VOLUME) {
			//this.setVolume(RemoteControl);
			this.volume = RemoteControl.MAX_VOLUME;
		}
			else if (volume< RemoteControl.MIN_VOLUME)	{
				this.volume =RemoteControl.MIN_VOLUME;;
				
			}else {
				this.setVolume( volume);
			}
		System.out.println("current vluams : "+ this.volume);
		
	}

}
