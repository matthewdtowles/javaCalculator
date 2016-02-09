package javaCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double n1 = 0, n2 = 0;
		String operation = null;
		Scanner scannerObject = new Scanner(System.in);

		Scanner op = new Scanner(System.in);
		System.out.println("Enter an operation: +, -, *, /, ^, sqrt, done [to EXIT]");
		operation = op.next();

		while (!operation.equals("done")) {

			System.out.println("Enter a number");

			while (!scannerObject.hasNextDouble()) {
				System.out.println("Invalid! - Enter a number");
				scannerObject.next();
			}
			n1 = scannerObject.nextDouble();

			System.out.println("Enter a number");

			while (!scannerObject.hasNextDouble()) {
				System.out.println("Invalid! - Enter a number");
				scannerObject.next();
			}

			n2 = scannerObject.nextDouble();

			switch (operation) {

			case "+":
				System.out.println("=" + (n1 + n2));
				break;

			case "-":
				System.out.println("=" + (n1 - n2));
				break;

			case "*":
				System.out.println("=" + (n1 * n2));
				break;

			case "/":
				if (n2 == 0) {
					System.out.println("Undefined");
				} else {
					System.out.println("=" + (n1 / n2));
				}
				break;

			case "sqrt":
				System.out.println("=" + (Math.sqrt(n1)));
				break;

			case "^":
				System.out.println("=" + (Math.pow(n1, n2)));
				break;

			default:
				System.out.println("Invalid");
			}

			System.out.println("Enter an operation: +, -, *, /, ^, done [to EXIT]");
			operation = op.next();
		}
		op.close();
	}
}
