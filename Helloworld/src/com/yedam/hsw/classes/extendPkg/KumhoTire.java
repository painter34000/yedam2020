package com.yedam.hsw.classes.extendPkg;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override
	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire 수명:"
		+ (maxRotation - accumulateRotation) + "회");
			return true;

		} else {
			System.out.println("***" + location + "Tire평크***");
			return false;

		}
	}
}