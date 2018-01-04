package icehs.science.chapter04;

public class GradeTest {
	public static void main(String[] args) {
		int score = 75;
		
		boolean result1 = (score <= 100) && (score >= 90);
		boolean result2 = (score < 90) && (score >= 80);
		boolean result3 = (score < 80) && (score >= 70);
		boolean result4 = (score < 70) && (score >= 60);
		
		
		System.out.println("A학점 : " + result1);
		System.out.println("B학점 : " + result2);
		System.out.println("C학점 : " + result3);
		System.out.println("D학점 : " + result4);
	}
}
