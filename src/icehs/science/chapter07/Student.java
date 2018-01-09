package icehs.science.chapter07;

public class Student {
	public static int STUDENT_NO = 0;
	
	private String stu_name;
	private String stu_no;
	private int grade;
	
	public Student(String stu_name, String stu_no) {
		this.stu_name = stu_name;
		this.stu_no = stu_no;
		STUDENT_NO++;
	}
	
	public Student(String stu_name, String stu_no, int grade) {
		this.stu_name = stu_name;
		this.stu_no = stu_no;
		this.grade = grade;
		STUDENT_NO++;
	}
	
	public String getStu_name() {
		return stu_name;
	}
	
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	
	public String getStu_no() {
		return stu_no;
	}
	
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
