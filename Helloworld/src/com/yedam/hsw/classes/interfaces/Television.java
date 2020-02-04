package com.yedam.hsw.classes.interfaces;

public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println(" TV 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV 끕니다");
	}

}
