package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		int studentNo = 0;
		int sumScore = 0;
		double avgScore = 0.0;
		
		System.out.print("���� �л� ����? : ");
		studentNo = getUserInput();
		for(int i = 1 ; i <= studentNo ; i++) {
			System.out.print(i + "�� ���� : ");
			sumScore += getUserInput();
		}
		avgScore = (double)sumScore / studentNo;
		
		System.out.println("==================");
		System.out.println(studentNo +"���� ���� : " + sumScore + "��");
		System.out.println(studentNo +"���� ��� : " + avgScore + "��");
		System.out.println("==================");
	}
	
	public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
