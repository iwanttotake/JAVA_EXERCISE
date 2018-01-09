package icehs.science.chapter07;

public class ItBookTest {
	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		ItBook java = new ItBook("Java 2.0", 28000, 3.2);
		ItBook servlet = new ItBook("Servlet/JSP", 37000, 6.9);

		sql.printItBookInfo();
		java.printItBookInfo();
		servlet.printItBookInfo();
		
		System.out.println(sql.getTitle() + "�� ������ �������� �����մϴ�.");
		sql.setPrice(5000);
		sql.setDiscountRage(9.5);
		sql.printItBookInfo();
		
		System.out.println(java.getTitle() + "�� ������ �����մϴ�.");
		java.setPrice(33000);
		java.printItBookInfo();
		
		System.out.println(servlet.getTitle() + "�� ����� �������� �����մϴ�.");
		servlet.setTitle("Servlet & JSP");
		servlet.setDiscountRage(12.6);
		servlet.printItBookInfo();
	}
}
