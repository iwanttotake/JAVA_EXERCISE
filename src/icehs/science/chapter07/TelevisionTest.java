package icehs.science.chapter07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television infinia = new Television("INFINIA", 1500000);
		Television xcanvas = new Television("XCANVAS", 1000000, "LCD TV");
		Television cinema = new Television("CINEMA", 2000000, "3D TV");
		
		infinia.printTelevisionInfo();
		xcanvas.printTelevisionInfo();
		cinema.printTelevisionInfo();
		
		int totalPrice = infinia.price + xcanvas.price + cinema.price;
		System.out.println("가격의 합 : " + totalPrice);
	}
}
