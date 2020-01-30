package classes;

public class Method {

	int leftField;
	int rightField;

//	public static void main(String[] args) {
//
//		int num1 = 10, num2 = 15;
//		int result = sum(num1, num2) * minus(num1, num2);
//		
//		System.out.println("결과값은: " + result);
//
//	}

	public int getLeftField() {
		return leftField;
	}

	public void setLeftField(int leftField) {
		this.leftField = leftField;
	}

	public int getRightField() {
		return rightField;
	}

	public void setRightField(int rightField) {
		this.rightField = rightField;
	}

	public int thisSum() {
		return leftField + rightField;

	}

	public int thisminus() {
		return leftField - rightField;

	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;

	}
}
