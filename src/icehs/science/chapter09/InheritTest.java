package icehs.science.chapter09;

public class InheritTest {
	public static void main(String[] args) {
		//Person p1 = new Person();
		Student s1 = new Student("임꺽정", "1234-5678", "컴퓨터과");
		Teacher t1 = new Teacher("조벽", "4444-7777", "윤리");
		
		//p1.eat();
		//s1.eat();
		t1.eat();
		
		s1.study();
		t1.teach();
	}
}
