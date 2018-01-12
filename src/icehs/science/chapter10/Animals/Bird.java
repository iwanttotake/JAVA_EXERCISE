package icehs.science.chapter10.Animals;

public class Bird extends Animal implements IFlyable {
	private String habitat;

	public Bird(String kind, int age, String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void fly() {
		System.out.println("���ư���.");
	}

	@Override
	public void spreadWing() {
		System.out.println("������ ��ģ��.");
	}
}
