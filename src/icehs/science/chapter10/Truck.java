package icehs.science.chapter10;

public class Truck extends Car {
	private int maxWeight;
	
	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ�� " + distance + "km �̵��մϴ�.");
		System.out.println("���� : " + getOilSize());
	}
	
	@Override
	public void wash() {
		System.out.print("Ʈ�� : ");
		super.wash();
	}
}
