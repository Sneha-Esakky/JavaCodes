package javaCodes;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a double value: ");
		double num1 = sc.nextDouble();
		System.out.println("enter 2nd double value: ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("enter the operator to be used: ");
		char operator = sc.nextLine().charAt(0);
		switch(operator) {
		case '+': System.out.println("Result:"+ (num1 + num2));
		break;
		case '-': System.out.println("Result:"+ (num1 - num2));
		break;
		case '*': System.out.println("Result:"+ (num1 * num2));
		break;
		case '/': System.out.println("Result:"+ (num1 / num2));
		break;
		default:System.out.println("Invalid operator");
		break;
		}

	}

}
