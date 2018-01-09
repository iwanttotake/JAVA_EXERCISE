package icehs.science.chapter07;

public class PrimitiveValueTest {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println(pub1);

		Publication pub2 = new Publication();
		System.out.println(pub2);
		pub2.setTitle("바람의 아들");
		
		Publication pub3 = pub2;
		System.out.println(pub3.getTitle());
		pub2 = null;
	}
}
