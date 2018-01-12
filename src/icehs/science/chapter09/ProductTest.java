package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product("통돌이", 450000, 8);
		Television tv1 = new Television("시네마 TV", 3500000, 10, "화면 크기 151cm");
		
		System.out.println("========== 제폼 정보 ==========");
		p1.printProductInfo();
		
		System.out.println("----------------------------");
		tv1.printProductInfo();
		System.out.println("비고 : " + tv1.getDescription());
		
		System.out.println();
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다!!");
		System.out.println();
		
		p1.setDiscountRate(15);
		tv1.setDiscountRate(15);
		
		System.out.println(p1.getName() + " 판매가 : " + p1.calculateDiscountPrice());
		System.out.println(tv1.getName() + " 판매가 : " + tv1.calculateDiscountPrice());
	}
}
