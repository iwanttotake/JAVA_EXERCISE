package icehs.science.chapter10.mobiles;

public class MobileTest {
	public static void main(String[] args) {
		Mobile[] mobiles = {new Galaxy("Galaxy"), new Iphone("Iphone")};
		
		Galaxy galaxy = (Galaxy)mobiles[0];
		galaxy.setOsVersion("�ȵ���̵� ������");
		galaxy.printOsVer();
		mobiles[0].call(5);
		mobiles[0].charge(30);
		
		Iphone iphone = (Iphone)mobiles[1];
		iphone.setColor("���");
		iphone.printColor();
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}
}
