package GameEngine;

public class GameEngine {
	static MessageManager massageManager = new MessageManager();
	static VideoManager videoManager = new VideoManager();
	
	
	public static void main(String[] args) {
		Message message = null;
		
		//TODOfjosdfjosdfjpsojfsdpfskdljflskdjflksdjflksdjflksdjlk
		while(message != null) {
			message = MessageManager.GetMessage();
			
			//메세지가 있으면 메세지 처리
			if(message != null) {
				
			}
			//처리할 메세지가 없으면 게임 업데이트
			else {
				Tick();
			}
		}
	}
	
	static void Tick() {
		videoManager.UpdateScreen();
	}
	
	static void receiveMessage(String message) {
		switch(message) {
		case "Input":
			break;
		default:
			ConsoleManager.PrintError("정의되지 않은 메세지입니다.");
		}
	}
}
