package icehs.science.chapter04;

public class SalaryTeset
{
	public static void main(String[] args)
	{
		int monthSalary = 1000000;
		int yearSalary = monthSalary * 12;
		int bonus = monthSalary * 20/100 * 4;
		
		int bonusTax = bonus * 55/1000;
		int yearSalaryTax = monthSalary * 12 * 1/10;
		
		int totalSalary = yearSalary + bonus - yearSalaryTax - bonusTax;
		

		System.out.println("���� : " + yearSalary + ", ���� ���� : " + (yearSalary - yearSalaryTax));
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + (bonus - bonusTax));
		System.out.println("���޾� : " + totalSalary);
	}
}
