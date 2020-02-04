package com.yedam.hsw.classes.interfaces;

public interface RemoteControl {
	//(상구)필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME=0;
	//생성자(X)
	//(추상)메소드
	public abstract void turnOn();
	public void turnOff();
	
	
}
