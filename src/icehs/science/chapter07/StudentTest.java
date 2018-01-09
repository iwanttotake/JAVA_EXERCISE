package icehs.science.chapter07;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("积己切积荐: " + Student.STUDENT_NO);
		
		Student stu1 = new Student("全辨悼", "STU001", 4);
		Student stu2 = new Student("全辨老", "STU002", 1);
		Student stu3 = new Student("全辨捞", "STU003", 2);
		Student stu4 = new Student("全辨伙", "STU004", 3);
		
		System.out.println("积己切积荐: " + Student.STUDENT_NO);
		stu1.STUDENT_NO++;
		System.out.println("积己切积荐: " + stu1.STUDENT_NO);
		System.out.println("积己切积荐: " + stu2.STUDENT_NO);
	}
}
