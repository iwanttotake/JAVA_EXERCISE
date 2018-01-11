package icehs.science.chapter08;

public class MaxMinTest {
	public static void main(String[] args) {
		int[] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		int max = numbers[0];
		int min = numbers[0];
		
		System.out.print("배열 데이터 : ");
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			if(numbers[i] < min) {
				min = numbers[i];
			}
			
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
