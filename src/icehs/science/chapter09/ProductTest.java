package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product("�뵹��", 450000, 8);
		Television tv1 = new Television("�ó׸� TV", 3500000, 10, "ȭ�� ũ�� 151cm");
		
		System.out.println("========== ���� ���� ==========");
		p1.printProductInfo();
		
		System.out.println("----------------------------");
		tv1.printProductInfo();
		System.out.println("��� : " + tv1.getDescription());
		
		System.out.println();
		System.out.println("[����] �������� ��� 15%�� �����մϴ�!!");
		System.out.println();
		
		p1.setDiscountRate(15);
		tv1.setDiscountRate(15);
		
		System.out.println(p1.getName() + " �ǸŰ� : " + p1.calculateDiscountPrice());
		System.out.println(tv1.getName() + " �ǸŰ� : " + tv1.calculateDiscountPrice());
	}
}