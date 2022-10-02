package com.test.ch06;

public class Television implements RemoteControl ,Searchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
System.out.println("TELEVISION! ON");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(String u) {
		// TODO Auto-generated method stub
		System.out.println("서치한다 :::"+u);
	}

	@Override
	public void turOn() {
		// TODO Auto-generated method stub
		
	}

}
