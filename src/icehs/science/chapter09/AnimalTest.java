package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3, "其福矫救", "具克捞");
		Dog d1 = new Dog(2, "矫海府救倾胶虐", "港港捞");
		
		c1.run();
		c1.hunt();
		c1.play();
		d1.run();
		d1.hunt();
	}
}
