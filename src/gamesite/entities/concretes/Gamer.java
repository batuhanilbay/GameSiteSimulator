package gamesite.entities.concretes;

import java.time.LocalDate;
import gamesite.entities.abstracts.Entity;

public class Gamer implements Entity{
	
	private int gamerId;
	private String gamerUsername;
	private String firstName;
	private String lastName;
	private LocalDate dateofBirth;
	private String nationalId;
	private String email;
	private String password;


	
	public Gamer() {
		
	}


	public Gamer(int gamerId, String gamerUsername, String firstName, String lastName, LocalDate dateofBirth,
			String nationalId, String email, String password) {
		super();
		this.gamerId = gamerId;
		this.gamerUsername = gamerUsername;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalId = nationalId;
		this.email = email;
		this.password = password;
	}


	public int getGamerId() {
		return gamerId;
	}


	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}


	public String getGamerUsername() {
		return gamerUsername;
	}


	public void setGamerUsername(String gamerUsername) {
		this.gamerUsername = gamerUsername;
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


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}





	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
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
	}


	
	
	
	
	
	
	
	
	
	
}
