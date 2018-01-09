package GameEngine;

public class GameEngine {
	static MessageManager massageManager = new MessageManager();
	static VideoManager videoManager = new VideoManager();
	
	
	public static void main(String[] args) {
		String message = MessageManager.GetMessage();
		
		
		Tick();
	}
	
	static void Tick() {
		videoManager.UpdateScreen();
	}
}
