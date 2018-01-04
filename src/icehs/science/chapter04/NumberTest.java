package icehs.science.chapter04;

public class NumberTest {
	public static void main(String[] args) {
		int number = 10;
		
		System.out.println(number + "은 양수입니까? : " + (number > 0));
		System.out.println(number + "은 짝수입니까? : " + (number % 2 == 0));
		System.out.println(number + "은 홀수입니까? : " + (number % 2 != 0));
		System.out.println(number + "은 30보다 큽니까? : " + (number > 30));
	}
}
