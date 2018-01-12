package icehs.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		Car[] cars = {new Taxi(), new Truck()};
		
		for (int i = 0; i < cars.length; i++) {			
			cars[i].setOilSize(10);
			cars[i].go((i + 2) * 10);
			
			if(cars[i] instanceof Taxi) {
				Taxi taxi = (Taxi)cars[i];
				taxi.setMaxNum(4);
				System.out.println("택시 정원 : " + taxi.getMaxNum() + "명");
			}
			else if(cars[i] instanceof Truck) {
				Truck truck = (Truck)cars[i];
				truck.setMaxWeight(100);
				System.out.println("트럭 최대 적재량 : " + truck.getMaxWeight() + "kg");
			}
		}
	}
}
