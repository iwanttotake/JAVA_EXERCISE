package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car iceCar = new Car();
		iceCar.oilAmount = 5;
		iceCar.driveDistance = 140.0;
		
		iceCar.carInfo();
		
		iceCar.addOil(10);
		iceCar.carInfo();
		
		iceCar.driveCar("IT센터", "인천공항", 10.17);
		iceCar.carInfo();
		
		iceCar.driveCar("인천공항", "곤지암리조트", 60.21);
		iceCar.carInfo();
		
		double enableDistance = iceCar.calculateDrivingDistance();
		
		System.out.println("주행 가능한 거리는 약 " + enableDistance + "km 입니다.");
	}
}
