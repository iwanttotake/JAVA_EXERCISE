package icehs.science.chapter08;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] books = {new Book("습관의 힘", 16000),
						new Book("빅 픽처", 12000),
						new Book("7년 후", 13500)};
		int sum = 0;
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getTitle() + " : " + books[i].getPrice());
			sum += books[i].getPrice();
		}
		System.out.println("책의 합계 : " + sum + "원");
	}
}
