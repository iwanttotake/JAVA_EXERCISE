package GameEngine;

import java.util.LinkedList;
import java.util.Queue;

public class MessageManager {
	public static InputManager inputManager = new InputManager();
	
	static Queue messageQueue = new LinkedList<Message>();
	public static boolean isEmpty = true;
	
	//�޼���ť�� �޼��� ü���
	public static void UpdateMessageQueue() {
		//����� �Է�
		messageQueue.add(inputManager.GetUserInput());
		
		
		isEmpty = messageQueue.isEmpty();
	}
	
	//�޼���ť���� ù��° �޼��� ��������
	public static Message GetMessage() {
		if(isEmpty) {
			ConsoleManager.PrintError("�޼���ť�� ����ִ� ���¿��� �޼����� �������� �Ͽ����ϴ�.");
			return null;
		}
		else {
			return (Message)messageQueue.poll();
		}
	}
}
