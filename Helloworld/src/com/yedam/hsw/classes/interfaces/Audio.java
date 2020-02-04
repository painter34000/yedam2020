package com.yedam.hsw.classes.interfaces;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		// TODO Auto-generated method stub
		
	}
	
	
}
