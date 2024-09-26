package com.amdocs.si.dao;

import com.amdocs.si.model.Data;

public class DataImpl implements DataIntf{
	int num1;
	int num2;
	
	public int sum(Data data) {
		num1=data.getNum1();
		num2=data.getNum2();
		return num1 + num2;
	}

	public int sub(Data data) {
		num1=data.getNum1();
		num2=data.getNum2();
		return num1 - num2;
	}

	public int mul(Data data) {
		num1=data.getNum1();
		num2=data.getNum2();
		return num1 * num2;
	}

	public int div(Data data) {
		num1=data.getNum1();
		num2=data.getNum2();
		return num1 / num2;
	}
}
