package testmenu;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Login logger = new Login();
		FileReader reader = new FileReader("credentials.txt");
		LinkedList<User> registro;
		registro = reader.readFile();
		logger.login();
		logger.checkType(registro);
		logger.printMenu();
	}
}
