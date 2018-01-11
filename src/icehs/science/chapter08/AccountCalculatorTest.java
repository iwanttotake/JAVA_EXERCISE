package icehs.science.chapter08;

public class AccountCalculatorTest {
	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account("111-2222-555" + (i + 1), 10000 * (i + 1), 4.5);
			System.out.println("계좌번호 : " + accounts[i].getNumber() + " / 잔액 : " + 
					accounts[i].getBalance() + "원 / 이율 : " + accounts[i].getInterestRate() + "%");
		}
		
		System.out.println();
		System.out.println("이율을 변경합니다.");
		System.out.println();
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].setInterestRate(3.7);
			accounts[i].calculateInterest();
			System.out.println("계좌번호 : " + accounts[i].getNumber() + " / 이율 : " + 
					accounts[i].getInterestRate() + "% / 잔액 : " + accounts[i].getBalance());
		}
	}
}
