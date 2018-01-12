package icehs.science.chapter10.mobiles;

public class Galaxy extends Mobile implements GooPlay {
	private String osVersion;
	
	public Galaxy(String production) {
		super(production);
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Override
	public void call(int time) {
		System.out.print(getProduction() + " : ");
		super.call(time);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(getProduction() + " : ���� ���͸� " + time + "�� ����");
	}
	
	public void printOsVer() {
		System.out.println(getProduction() + " : " + getOsVersion());
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println(getProduction() + " : " + kind + " ���� " + price + "���� �����߽��ϴ�.");
	}
}
