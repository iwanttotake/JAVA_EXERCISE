package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee americano = new Coffee();
		Coffee latte = new Coffee();
		Coffee makiatto = new Coffee();
		int totalPrice = 0;
		
		americano.name = "아메리카노";
		latte.name = "카페라떼";
		makiatto.name = "마끼아또";
		
		americano.price = 3500;
		latte.price = 4000;
		makiatto.price = 4500;
		
		americano.printCoffeeInfo();
		latte.printCoffeeInfo();
		makiatto.printCoffeeInfo();
		
		totalPrice = americano.price + latte.price + makiatto.price;
		System.out.println("총 금액 : " + totalPrice + "원");
	}
}
