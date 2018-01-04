package icehs.science.chapter03;

public class StudentScore
{
	public static void main(String[] args)
	{
		double mathScore = 94.7;
		double englishScore = 83.2;
		double koreanScore = 87.1;
		
		int intmathScore = (int)mathScore;
		int intenglishScore = (int)englishScore;
		int intkoreanScore = (int)koreanScore;
		
		
		System.out.println("수학 : " + intmathScore);
		System.out.println("영어 : " + intenglishScore);
		System.out.println("국어 : " + intkoreanScore);
	}
}
