package icehs.science.chapter10.Animals;

public class AnimalTest {
	public static void main(String[] args) {
		Animal b1 = new Bird("독수리", 3, "바위산");
		Bird hawk = (Bird)b1;
		
		System.out.println(hawk.getKind() + "(" + hawk.getAge() + 
				") : " + hawk.getHabitat() + "등");
		hawk.spreadWing();
		hawk.fly();
	}
}
