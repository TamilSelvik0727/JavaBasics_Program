package javaBasics;
//print the number of days in given month(1 to 12)

//Example-Input -12, output=31

public class PrintNumberOfDaysInMonth_7 {
	public static void main(String[] args) {
		int month = 6;
		if (month == 1) {
			System.out.println("31");
		} else if (month == 2) {
			System.out.println("29/28");
		} else if (month == 3) {
			System.out.println("30");
		} else if (month == 4) {
			System.out.println("31");
		} else if (month == 5) {
			System.out.println("30");
		} else if (month == 6) {
			System.out.println("31");
		}
		if (month == 7) {
			System.out.println("31");
		} else if (month == 8) {
			System.out.println("31");
		} else if (month == 9) {
			System.out.println("30");
		} else if (month == 10) {
			System.out.println("31");
		} else if (month == 11) {
			System.out.println("30");
		} else if (month == 12) {
			System.out.println("31");
		}

		else {
			System.out.println("sorry!! we have only 12 months");
		}

	}

}
