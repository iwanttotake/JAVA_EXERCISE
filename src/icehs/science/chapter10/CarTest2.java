package icehs.science.chapter10;

public class CarTest2 {
	public static void main(String[] args) {
		Car[] cars = {new Car(), new Taxi(), new Truck()};
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].wash();
		}
	}
}
