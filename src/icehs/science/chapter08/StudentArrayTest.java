package icehs.science.chapter08;

public class StudentArrayTest {
	public static void main(String[] args) {
		Student[] students = {new Student("강감찬", "STU0001", "010-1234-5678"),
							  new Student("이순신", "STU0002", "010-2345-6789"),
							  new Student("김유신", "STU0003", "010-9876-5432")};
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + "(" + students[i].getId() + 
					") / 전화번호 : " + students[i].getPhone());
		}
	}
}
