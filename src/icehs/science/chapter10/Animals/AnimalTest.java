package icehs.science.chapter10.Animals;

public class AnimalTest {
	public static void main(String[] args) {
		Animal b1 = new Bird("������", 3, "������");
		Bird hawk = (Bird)b1;
		
		System.out.println(hawk.getKind() + "(" + hawk.getAge() + 
				") : " + hawk.getHabitat() + "��");
		hawk.spreadWing();
		hawk.fly();
	}
}
