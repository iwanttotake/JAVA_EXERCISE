package icehs.science.chapter08;

public class OddEvenIndexSumTest {
	public static void main(String[] args) {
		int[] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		int oddSum = 0;
		int evenSum = 0;
		
		System.out.print("배열 데이터 : ");
		for (int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				 oddSum += numbers[i];
			} else {
				evenSum += numbers[i];
			}
			
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
		System.out.println("홀수 번째 정수의 합 : " + oddSum);
		System.out.println("짝수 번째 정수의 합 : " + evenSum);
	}
}
