package icehs.science.chapter10.mobiles;

public class Iphone extends Mobile {
	private String color;
	
	public Iphone(String production) {
		super(production);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void call(int time) {
		System.out.print(getProduction() + " : ");
		super.call(time);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(getProduction() + " : " + time + "분 충전했더니 Full!!");
	}
	
	public void printColor() {
		System.out.println(getProduction() + " : " + getColor());
	}
}
