package icehs.science.chapter04;

public class ExamForTest {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {11, 22, 33, 44, 55, 66, 77};
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
