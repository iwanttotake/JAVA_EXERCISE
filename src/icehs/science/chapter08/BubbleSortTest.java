///////////////
//오름차순으로 정렬//
///////////////

package icehs.science.chapter08;


public class BubbleSortTest {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 1, 3, 4, 6, 8};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				//왼쪽 요소가 오른쪽 요소보다 크면 서로 교환
				if(numbers[j - 1] > numbers[j]) {
					int temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
				//왼쪽 요소가 오른쪽 요소보다 작으면 더이상 볼 필요가 없음 
				else {
					break;
				}
			}
		}
		
		//결과 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
