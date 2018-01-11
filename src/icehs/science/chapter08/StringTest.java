package icehs.science.chapter08;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc1");
		String str6 = str2;
		
		if(str1 == str2) {
			System.out.println("두 객체는 같습니다.");
		}
		
		if(str3 == str4) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
		
		if(str1 == str3) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("같은 글자입니다.");
		} else {
			System.out.println("다른 글자입니다.");
		}
		
		if(str1.equals(str4)) {
			System.out.println("같은 글자입니다.");
		} else {
			System.out.println("다른 글자입니다.");
		}
		
		if(str2 == str6) {
			System.out.println("두 객체는 같습니다.");
		} else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
	}
}
