package icehs.science.chapter08;

public class ScoreArrayTest {
	public static void main(String[] args) {
		String[] subjects = {"국어", "영어", "수학"};
		int[] scores = {93, 87, 90};
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i] + "점");
		}
		
		avg = (double)sum / scores.length;
		
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
	}
}
