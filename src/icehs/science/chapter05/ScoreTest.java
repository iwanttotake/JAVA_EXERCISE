package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		int stuNo = 0;
		int sumScore = 0;
		double avgScore = 0.0;
		
		System.out.print("���� �л� ����? : ");
		stuNo = getUserInput();
		for(int i = 1 ; i <= stuNo ; i++) {
			System.out.print(i + "�� ���� : ");
			sumScore += getUserInput();
		}
		avgScore = (double)sumScore / stuNo;
		
		System.out.println("==================");
		System.out.println(stuNo +"���� ���� : " + sumScore + "��");
		System.out.println(stuNo +"���� ��� : " + avgScore + "��");
		System.out.println("==================");
	}
	
	public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
