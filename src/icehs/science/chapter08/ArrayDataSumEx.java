package icehs.science.chapter08;

public class ArrayDataSumEx {
	public static void main(String[] args) {
		int[] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int sum = 0;
		
		System.out.print("배열의 내용 : ");
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		System.out.println("합계 : " + sum);
	}
}
