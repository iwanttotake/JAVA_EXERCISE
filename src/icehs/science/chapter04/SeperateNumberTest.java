package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		
		int number = 456;
		
		int hundredNumber = number / 100;
		int tenNumber = number % 100 / 10;
		int oneNumber = number % 10;
		
		System.out.println("���� �ڸ� : " + hundredNumber);
		System.out.println("���� �ڸ� : " + tenNumber);
		System.out.println("���� �ڸ� : " + oneNumber);		
	}
}
