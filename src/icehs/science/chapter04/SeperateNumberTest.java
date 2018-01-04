package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		
		int number = 456;
		
		int hundredNumber = number / 100;
		int tenNumber = number % 100 / 10;
		int oneNumber = number % 10;
		
		System.out.println("백의 자리 : " + hundredNumber);
		System.out.println("십의 자리 : " + tenNumber);
		System.out.println("일의 자리 : " + oneNumber);		
	}
}
