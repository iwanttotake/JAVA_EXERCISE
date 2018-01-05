package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	void changeAdress(String newAdress) {
		address = newAdress;
	}
}
