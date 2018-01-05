package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		build1.name = "국제선타워";
		build1.address = "운서동";
		build1.totalFloor = 5;
		
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.address);
		System.out.println("층수 : " + build1.totalFloor);
		build1.moveElevator();
		System.out.println("변경후");
		build1.changeAdress("김포동");
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.address);
		System.out.println("층수 : " + build1.totalFloor);
	}
}
