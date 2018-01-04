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
		

		System.out.println("연봉 : " + yearSalary + ", 세후 연봉 : " + (yearSalary - yearSalaryTax));
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + (bonus - bonusTax));
		System.out.println("지급액 : " + totalSalary);
	}
}
