package icehs.science.chapter05;

public class VariousSumEx {
	public static void main(String[] args) {
		int totalSum = 0; //��ü �հ�
		int evenSum = 0; //¦�� �հ�
		int oddSum = 0; //Ȧ�� �հ�
		
		for(int i = 0 ; i <= 1000 ; i++) {
			if((i % 2) == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		totalSum = evenSum + oddSum;
		
		System.out.println("1���� 100������ �� : " + totalSum);
		System.out.println("1���� 100���� ¦������ �� : " + evenSum);
		System.out.println("1���� 100���� Ȧ������ �� : " + oddSum);
	}
}
