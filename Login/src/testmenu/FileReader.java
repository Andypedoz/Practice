package testmenu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {
	private File credfile;
	private Scanner scan;
	
	public FileReader(String filename) {
		this.credfile = new File(filename);
		try {
			this.scan = new Scanner(this.credfile);
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
	
	public LinkedList<User> readFile() {
		if(this.credfile != null) {
			User utente;
			LinkedList<User> registro = new LinkedList<>();
			while(this.scan.hasNextLine()) {
				String username = this.scan.nextLine();
				String password = this.scan.nextLine();
				String type = this.scan.nextLine();
				utente = new User(username,password,type);
				registro.add(utente);
			}
			return registro;
		} else
			return null;
	}
}