package icehs.science.chapter05;

public class NumberCheckTest {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		int mul = number1 * number2;
		
		
		if(mul < 0) {
			System.out.println(number1 + " * " + number2 + " : 음수는 확인하지 않습니다.");
		}else if(mul < 10) {
			System.out.println(number1 + " * " + number2 + " : 한 자리수입니다.");
		}else if(mul < 100) {
			System.out.println(number1 + " * " + number2 + " : 두 자리수입니다.");
		}else {
			System.out.println(number1 + " * " + number2 + " : 세 자리수 이상입니다.");
		}
	}
}
