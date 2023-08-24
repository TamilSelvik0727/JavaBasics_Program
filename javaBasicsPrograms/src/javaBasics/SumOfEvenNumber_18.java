package javaBasics;

public class SumOfEvenNumber_18 {
	// sum of the even number 1 to 30
	// output->30
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
