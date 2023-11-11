package testmenu;

import java.util.LinkedList;
import java.util.Scanner;

public class Login {
	private User utente;
	private Scanner scan = new Scanner(System.in);
	private int type;
	
	public void login() {
		System.out.println("Insert username: ");
		String username = this.scan.nextLine();
		System.out.println("Insert password: ");
		String password = this.scan.nextLine();
		utente = new User(username,password);
	}
	
	public void checkType(LinkedList<User> registro) {
		if(registro.contains(utente))
			for(User u: registro) {
				if(this.utente.equals(u))
					this.type = Integer.valueOf(u.getType());
			}
	}
	
	public void printMenu() {
		switch(this.type) {
		case 1:
			System.out.println("Sono uno studente");
			break;
		case 2:
			System.out.println("Sono un docente");
			break;
		case 3:
			System.out.println("Sono il preside");
			break;
		}
	}
}
