///////////////
//������������ ����//
///////////////

package icehs.science.chapter08;


public class BubbleSortTest {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 1, 3, 4, 6, 8};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				//���� ��Ұ� ������ ��Һ��� ũ�� ���� ��ȯ
				if(numbers[j - 1] > numbers[j]) {
					int temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
				//���� ��Ұ� ������ ��Һ��� ������ ���̻� �� �ʿ䰡 ���� 
				else {
					break;
				}
			}
		}
		
		//��� ���
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
