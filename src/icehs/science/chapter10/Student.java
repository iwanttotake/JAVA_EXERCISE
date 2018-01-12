package icehs.science.chapter10;

public class Student extends Person {
	private String department;
	
	public Student(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}
	
	public void eat() {
		System.out.println("조별로 밥을 먹다.");
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
