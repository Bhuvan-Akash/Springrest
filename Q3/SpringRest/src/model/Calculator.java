package model;

public class Calculator {
	int num1,num2;

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
