package nLayared.entities.concretes;

import nLayared.entities.abstracts.Entity;

public class User implements Entity{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean isClicked;

	
	public User() {}

	public User( String firstName, String lastName, String email, String password,boolean isClicked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.isClicked =isClicked;

	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	};
	
	public boolean isClicked() {
		return isClicked;
	}
	
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();	}

}
