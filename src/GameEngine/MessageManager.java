package GameEngine;

public class MessageManager {
	public static InputManager inputManager = new InputManager();
	
	
	public static String GetMessage() {
		return inputManager.getUserInput();
	}
}
