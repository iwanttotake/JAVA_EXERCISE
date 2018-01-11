package GameEngine;

public class GameObject {
	int id;
	String name;
	
	Vector2 position;

	String sprite = "0000"
				  + "0000"
				  + "0000"
				  + "0000";
	int orderToLayer;
	
	
	public GameObject(int id, String name, Vector2 position, String sprite, int orderToLayer) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.sprite = sprite;
		this.orderToLayer = orderToLayer;
	}
}
