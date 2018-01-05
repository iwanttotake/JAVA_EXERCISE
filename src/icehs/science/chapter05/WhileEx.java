package icehs.science.chapter05;

public class WhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(sum < 10) {
			sum += i;
			System.out.println(i + " : " + sum);
			i++;
		}
	}
}
