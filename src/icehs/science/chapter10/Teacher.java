package icehs.science.chapter10;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, String phone, String subject) {
		super(name, phone);
		this.subject = subject;
	}
	
	@Override
	public void eat() {
		System.out.println("ÇÔ²² ¹äÀ» ¸Ô´Ù.");
	}
	
	public void teach() {
		System.out.println("°¡¸£Ä¡´Ù.");
	}
}
