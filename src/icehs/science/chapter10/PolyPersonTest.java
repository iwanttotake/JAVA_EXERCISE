package icehs.science.chapter10;

public class PolyPersonTest {
	public static void main(String[] args) {
		Person[] p1 = {new Person(), 
					   new Student("홍길동", "123", "컴공과"), 
					   new Teacher("전우치", "124", "자바")};
//		Person p1 = new Person();
//		Person s1 = new Student("홍길동", "123", "컴공과");
//		Person t1 = new Teacher("전우치", "124", "자바");
		
		p1[0].eat();
		p1[1].eat();
		p1[2].eat();
	}
}
