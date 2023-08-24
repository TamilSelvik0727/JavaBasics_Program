package javaBasics;

public class Calculator_9 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String operation = "Add";
		switch (operation) {
		case "Add":
			System.out.println(num1 + num2);
			break;

		case "Mul":
			System.out.println(num1 * num2);
			break;
		case "Sub":
			System.out.println(num1 - num2);
			break;
		case "div":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Please Enter Valid operation");

		}

	}

}
