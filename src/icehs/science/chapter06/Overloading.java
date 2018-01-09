package icehs.science.chapter06;

public class Overloading {
	
	void addition(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	void addition(double a, double b) {
		double result = a * b;
		System.out.println(result);
	}
	
	void addition(String a, String b) {
		String result = a + b;
		System.out.println(result);
	}
}
