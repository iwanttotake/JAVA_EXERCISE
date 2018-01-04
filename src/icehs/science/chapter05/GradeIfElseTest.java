package icehs.science.chapter05;

public class GradeIfElseTest {
	public static void main(String[] args) {
		int gildongScore = 92;
		int gilsoonScore = 85;
		
		
		if(gildongScore >= 90){
			System.out.println("홍길동 : A학점 입니다.");
		}
		else{
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}
		
		if(gilsoonScore >= 90){
			System.out.println("홍길순 : A학점 입니다.");
		}
		else{
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}
	}
}
