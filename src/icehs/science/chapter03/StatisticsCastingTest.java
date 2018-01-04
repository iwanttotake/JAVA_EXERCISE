package icehs.science.chapter03;

public class StatisticsCastingTest
{
	public static void main(String[] args)
	{
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		
		int intLottoProbability = (int)lottoProbability;
		int intPopulation = (int)population;
		
		System.out.println(lottoProbability);
		System.out.println(intLottoProbability);
		System.out.println(population);
		System.out.println(intPopulation);
	}
}
