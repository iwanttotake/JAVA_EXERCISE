package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student hong = new Student();
		hong.stuName = "홍길동";
		hong.stuId = "Stu001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.mathScore = 89;
		
		hong.printStudentInfo();
		
		System.out.println("학번 변경");
		hong.changeStudentId("STU0001");
		
		hong.printStudentInfo();
	}
}
