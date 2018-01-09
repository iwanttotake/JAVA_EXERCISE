package icehs.science.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discountRage;
	
	public ItBook(String title, int price, double discountRage) {
		this.title = title;
		this.price = price;
		this.discountRage = discountRage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRage() {
		return discountRage;
	}
	
	public void setDiscountRage(double discountRage) {
		this.discountRage = discountRage;
	}
	
	void printItBookInfo() {
		System.out.println("����: " + getTitle() + ", ����: " 
	+ getPrice() + "��, ������: " + getDiscountRage() + "%, ���ΰ�: " + calculateDisPrice() + "��");
	}
	
	int calculateDisPrice() {
		int disPrice = (int)(price * (100 - discountRage) / 100);
		return disPrice;
	}
}
