package icehs.science.chapter10;

public class Taxi extends Car {
	private int maxNum;
	
	public int getMaxNum() {
		return maxNum;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("택시를 타고 " + distance + "km 이동합니다.");
		System.out.println("연료 : " + getOilSize());
	}
}
