package GameEngine;

import java.util.Scanner;

public class InputManager {
	public static String GetUserInput() {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()) {
        	String input = sc.nextLine();
        	return input;        	
        } else {
        	return null;
        }
    }
}
