package javaBasics;

//print 1 to 50 which is divisible by 5 or 3
public class ToPrintNumber_DivisibleBy5or3_14 {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 || i % 5 == 0)// applying filter
				System.out.println(i);
		}

	}

}
