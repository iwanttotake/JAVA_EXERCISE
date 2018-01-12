package icehs.science.chapter10;

public class Car {
	private int oilSize;
	
	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public void go(int distance) {
		System.out.println(distance + "km 이동합니다.");
		System.out.println("연료 : " + oilSize);
	}
}
