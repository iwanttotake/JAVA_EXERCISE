package icehs.science.chapter09;

public abstract class Person {
	private String name;
	private String phone;
	
	public Person() {
		this.name = "무명";
		this.phone = "전화번호 없음";
	}
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void eat() {
		System.out.println("사람이 밥을 먹다.");
	}
	
	public void sleep() {
		System.out.println("잠자다.");
	}
}
