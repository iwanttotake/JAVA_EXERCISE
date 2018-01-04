package icehs.science.chapter04;

public class RelationalOperatorEx {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 3;
		int number3 = 3;
		
		System.out.println(number1 > number2);
		System.out.println(number1 < number2);
		System.out.println(number1 >= number2);
		System.out.println(number1 <= number2);
		System.out.println(number2 >= number3);
		
		System.out.println(number1 == number2);
		System.out.println(number2 == number3);
		
		System.out.println(number1 != number2);
		System.out.println(number2 != number3);
	}
}
