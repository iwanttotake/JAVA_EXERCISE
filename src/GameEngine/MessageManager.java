package GameEngine;

import java.util.LinkedList;
import java.util.Queue;

public class MessageManager {
	public static InputManager inputManager = new InputManager();
	
	static Queue messageQueue = new LinkedList<Message>();
	public static boolean isEmpty = true;
	
	//메세지큐에 메세지 체우기
	public static void UpdateMessageQueue() {
		//사용자 입력
		messageQueue.add(inputManager.GetUserInput());
		
		
		isEmpty = messageQueue.isEmpty();
	}
	
	//메세지큐에서 첫번째 메세지 가져오기
	public static Message GetMessage() {
		if(isEmpty) {
			ConsoleManager.PrintError("메세지큐가 비어있는 상태에서 메세지를 가져오려 하였습니다.");
			return null;
		}
		else {
			return (Message)messageQueue.poll();
		}
	}
}
