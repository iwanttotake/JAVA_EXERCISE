package icehs.science.chapter04;

public class LogicalOperatorEx {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 3;
		
		boolean result1 = (number1 > number2) && (number1 > 5);
		boolean result2 = (number1 > number2) && (number1 == number2);
		boolean result3 = (number1 <= number2) || (number1 != number2);
		boolean result4 = (number1 <= number2) || !(number1 > number2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(!result4);
	}
}
