package icehs.science.chapter09;

public class Account {
	private String number;
	private String name;
	private int balnace;
	
	public Account(String number, String name, int balnace) {
		this.number = number;
		this.name = name;
		this.balnace = balnace;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalnace() {
		return balnace;
	}

	public void setBalnace(int balnace) {
		this.balnace = balnace;
	}

	public void openAccount() {
		System.out.println("°èÁÂ ¹øÈ£ : " + getNumber());
		System.out.println("¿¹±İÁÖ : " + getName());
		System.out.println("ÀÜ¾× : " + getBalnace());
	}
}
