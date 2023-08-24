package javaBasics;

public class FactorialOfGivenNumber_21 {

	// 5!=1*2*3*4*5
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

}
