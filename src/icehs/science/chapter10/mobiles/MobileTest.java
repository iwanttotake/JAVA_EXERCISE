package icehs.science.chapter10.mobiles;

public class MobileTest {
	public static void main(String[] args) {
		Mobile[] mobiles = {new Galaxy(), new Iphone()};
		
		mobiles[0].call(5);
		mobiles[0].charge(30);
		
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}
}
