package testmenu;

public class User {
	private String username;
	private String password;
	private String type;
	
	public User(String username, String password, String type) {
		this.username = username;
		this.password = password;
		this.type = type;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object o) {
		User utente = (User)o;
		boolean a = this.username.equals(utente.getUsername());
		boolean b = this.password.equals(utente.getPassword());
		return (a && b); 
	}
}
