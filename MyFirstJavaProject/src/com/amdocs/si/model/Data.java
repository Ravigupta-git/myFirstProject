package com.amdocs.si.model;

public class Data {
	private int num1;
	private int num2;

	public Data() {
		num1 = 0;
		num2 = 0;
	}

	public Data(int num1, int num2) {
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
}
