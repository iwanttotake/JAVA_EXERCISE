package icehs.science.chapter10.mobiles;

public class Iphone extends Mobile {
	private String color;
	
	@Override
	public void call(int time) {
		System.out.print("Iphone : ");
		super.call(time);
	}
	
	@Override
	public void charge(int time) {
		System.out.print("Iphone : ");
		super.charge(time);
	}
}
