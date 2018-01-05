package icehs.science.chapter05;

public class VariousSumEx {
	public static void main(String[] args) {
		int totalSum = 0; //전체 합계
		int evenSum = 0; //짝수 합계
		int oddSum = 0; //홀수 합계
		
		for(int i = 0 ; i <= 1000 ; i++) {
			if((i % 2) == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		totalSum = evenSum + oddSum;
		
		System.out.println("1부터 100까지의 합 : " + totalSum);
		System.out.println("1부터 100까지 짝수들의 합 : " + evenSum);
		System.out.println("1부터 100까지 홀수들의 합 : " + oddSum);
	}
}
