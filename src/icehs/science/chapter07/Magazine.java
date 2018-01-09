package icehs.science.chapter07;

public class Magazine {
	private String name;
	private int price;
	
	public Magazine(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	
	void printProductInfo() {
		System.out.println(name + " : " + price);
	}
}
