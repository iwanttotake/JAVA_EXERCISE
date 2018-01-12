package GameEngine;

public class Message {
	MessageType messageType;
	public String[] messages;
	
	public Message(MessageType messageType, String[] messages) {
		this.messages = messages;
	}
}
