package icehs.science.chapter06;

public class ChocolateTest {
	public static void main(String[] args) {
		Chocolate choco1=  new Chocolate();
		choco1.name = "아마도라";
		choco1.type = "다크";
		choco1.price = 2200;
		choco1.printChocolateInfo();
		
		String chocoName = choco1.getName();
		int totalPrice = choco1.calculateTotalPrice(20);
		
		System.out.println(chocoName + " 초콜렛 20개 가격 :" + totalPrice);
		choco1.changeChocolateInfo("기리쉬", 2500);
		int newTotalPrice = choco1.calculateTotalPrice(15, 10);
		System.out.println(choco1.name + " 초콜렛 15개 (10%할인) : " + newTotalPrice);
		
		choco1.changeChocolateInfo("트리플 블랑", "화이트", 2300);
	}
}
