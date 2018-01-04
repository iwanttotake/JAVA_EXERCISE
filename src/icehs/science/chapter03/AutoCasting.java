package icehs.science.chapter03;

public class AutoCasting{
	public static void main(String[] args){
		double number = 1000000003284732000.25;
		long longnumber = (long)number;
		int doublenumber = (int)longnumber;
		
		System.out.println(number);
		System.out.println(longnumber);
		System.out.println(doublenumber);
	}
}
