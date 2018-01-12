package GameEngine;

public class ConsoleManager {
	
	static void PrintWarning(String message) {
		System.out.println("[Warning] : " + message);
	}
	static void PrintError(String message) {
		System.out.println("======================================================");
		System.out.println("[Error] : " + message);
		System.out.println("======================================================");
	}
}
