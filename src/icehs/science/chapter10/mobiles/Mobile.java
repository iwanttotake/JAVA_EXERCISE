package icehs.science.chapter10.mobiles;

public class Mobile {
	private String production;
	private int price;
	
	public void call(int time) {
		System.out.println(time +"분 통화했습니다.");
	}
	
	public void charge(int time) {
		System.out.println(time +"분 충전했습니다.");		
	}
}
