package GameEngine;

public final class Vector2 {
	public int x, y;
	
	
	//Constructor
	public Vector2() {
		this.x = 0;
		this.y = 0;
	}
	public Vector2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//Operator
	public static Vector2 Add(Vector2 vec, int i) {
		return new Vector2(vec.x + i, vec.y + i);
	}
	public static Vector2 Add(Vector2 vec1, Vector2 vec2) {
		return new Vector2(vec1.x + vec2.x, vec1.y + vec2.y);
	}
	
	public static Vector2 Minus(Vector2 vec, int i) {
		return new Vector2(vec.x - i, vec.y - i);
	}
	public static Vector2 Minus(Vector2 vec1, Vector2 vec2) {
		return new Vector2(vec1.x - vec2.x, vec1.y - vec2.y);
	}
	
	public static Vector2 Mul(Vector2 vec, int i) {
		return new Vector2(vec.x * i, vec.y * i);
	}
	
	public static Vector2 Div(Vector2 vec, int i) {
		return new Vector2(vec.x / i, vec.y / i);
	}
}
