package com.amdocs.si.dao;

import java.util.Scanner;

import com.amdocs.si.model.Data;

public class Calculation {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result;

		int choice = 0;
		int repeat = 1;

		DataImpl dataImpl = new DataImpl();
		Scanner scanner = new Scanner(System.in);

		while (repeat == 1) {

			System.out.println("Main Menu");
			System.out.println("*********");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. div");
			System.out.println("5. Exit");

			System.out.println("Enter your choice (1-5): ");
			choice = scanner.nextInt();

			if (choice == 5) {
				System.exit(0);
			}
			System.out.println("Enter any 2 numbers : ");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();

			Data data = new Data(num1, num2);

			switch (choice) {
			case 1:
				result = dataImpl.sum(data);
				System.out.println("Sum = " + result);
				break;

			case 2:
				result = dataImpl.sub(data);
				System.out.println("Sub = " + result);
				break;

			case 3:
				result = dataImpl.mul(data);
				System.out.println("Mul = " + result);
				break;

			case 4:
				result = dataImpl.div(data);
				System.out.println("Div = " + result);
				break;

			default:
				System.out.println("Choice is out of range, try again");
			}
			System.out.println("Do you want to continue (1/0) :");
			repeat = scanner.nextInt();
		}
		scanner.close();
	}
}
