//////////////////
//������������ �迭 ����//
//////////////////

package icehs.science.chapter08;

//���������� �ƴҼ��� ����
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 1, 3, 4, 6, 8};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				//���� ��Ұ� ������ ��Һ��� ũ�� ���� ��ȯ
				if(Compare(numbers[j - 1], numbers[j])) {
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
	
	static boolean Compare(int left, int right) {
		//���������� if(left < right)�� �ٲٸ� ��
		if(left > right) {
			return true;
		}
		else {
			return false;
		}
	}
}
