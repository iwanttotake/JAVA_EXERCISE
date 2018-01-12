package icehs.science.chapter09;

public class DoctorTest {
	public static void main(String[] args) {
		Dentist dent = new Dentist("È«±æµ¿");		
		System.out.println(dent.getDepartment() + " : " + dent.getName() + " ¼±»ý´Ô");
		dent.treatPatient();
		dent.pullOutTooth();
	}
}
