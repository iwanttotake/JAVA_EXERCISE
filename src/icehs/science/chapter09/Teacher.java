package icehs.science.chapter09;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, String phone, String subject) {
		super(name, phone);
		this.subject = subject;
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("�Բ� ���� �Դ�.");
	}
	
	public void teach() {
		System.out.println("����ġ��.");
	}
}
