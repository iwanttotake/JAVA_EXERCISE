package icehs.science.chapter06;

public class OverloadingTest {
	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.addition(1, 2);
		over.addition(2.1, 3.4);
		over.addition("ab", "cd");
	}
}
