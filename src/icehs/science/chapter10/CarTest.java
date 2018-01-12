package icehs.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {new Taxi(), new Truck()};
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].setOilSize(10);
			cars[i].go((i + 2) * 10);
		}
	}
}
