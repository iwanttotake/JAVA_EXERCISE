package GameEngine;

public class GameEngine {
	static MessageManager massageManager = new MessageManager();
	static VideoManager videoManager = new VideoManager();
	
	
	public static void main(String[] args) {
		Message message = null;
		
		//TODOfjosdfjosdfjpsojfsdpfskdljflskdjflksdjflksdjflksdjlk
		while(message != null) {
			message = MessageManager.GetMessage();
			
			//�޼����� ������ �޼��� ó��
			if(message != null) {
				
			}
			//ó���� �޼����� ������ ���� ������Ʈ
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
			ConsoleManager.PrintError("���ǵ��� ���� �޼����Դϴ�.");
		}
	}
}
