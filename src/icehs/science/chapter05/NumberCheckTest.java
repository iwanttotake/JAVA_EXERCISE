package icehs.science.chapter05;

public class NumberCheckTest {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		int mul = number1 * number2;
		
		
		if(mul < 0) {
			System.out.println(number1 + " * " + number2 + " : ������ Ȯ������ �ʽ��ϴ�.");
		}else if(mul < 10) {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ����Դϴ�.");
		}else if(mul < 100) {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ����Դϴ�.");
		}else {
			System.out.println(number1 + " * " + number2 + " : �� �ڸ��� �̻��Դϴ�.");
		}
	}
}
