package icehs.science.chapter07;

public class MagazineTest {
	public static void main(String[] args) {
		Magazine mag1 = new Magazine("Maxim", 15000);
		/*mag1.name = "xxx";
		mag1.price = 5000;*/
		mag1.setName("»Ñ¸®±íÀº³ª¹«");
		mag1.setPrice(5000);
		
		Magazine mag2 = new Magazine("cosmopolitan", 30000);
		String title = mag2.getName();
		int price = mag2.getPrice();
		System.out.println(title + " : " + price);
	}
}
