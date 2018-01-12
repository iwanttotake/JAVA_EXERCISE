package icehs.science.chapter10.mobiles;

public class Galaxy extends Mobile {
	private String osVersion;
	
	@Override
	public void call(int time) {
		System.out.print("Galaxy : ");
		super.call(time);
	}
	
	@Override
	public void charge(int time) {
		System.out.print("Galaxy : ");
		super.charge(time);
	}
}
