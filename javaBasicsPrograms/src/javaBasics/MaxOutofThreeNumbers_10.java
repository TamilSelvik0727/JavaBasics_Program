package javaBasics;

//input 40,10,20 output-40
//input 100,50,99, output 100
public class MaxOutofThreeNumbers_10 {
	public static void main(String[] args) {
		int a =40, b=10, c=200;
		
		if(a>b && a>c) {
		System.out.println(a);
		}
		else if(b>c) {
		System.out.println(b);
		}
		else {
		System.out.println(c);
		}
	}

}
