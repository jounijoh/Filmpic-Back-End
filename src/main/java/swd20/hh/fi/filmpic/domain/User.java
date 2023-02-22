package swd20.hh.fi.filmpic.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String firstname;
	private String lastname;

	// Username with unique constraint
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String passwordHash;
	
	@Column(name = "role", nullable = false)
	private String role;
	
	private boolean enabled;
	
	//@OneToMany
	//@JsonIgnoreProperties("user")
	//private List<Photograph> photographs;
	
	// KONSTRUKTORIT
	public User() {
	}

	public User(String firstname, String lastname, String username, String paswordHash, String email, String role) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.passwordHash = paswordHash;
		this.email = email;
		this.role = role;
	}
	public User(String firstname, String lastname, String username, String paswordHash, String email, String role, boolean enabled) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.passwordHash = paswordHash;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
	}
	// SETTERIT
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	//public void setPhotographs(List<Photograph> photographs) {
	//	this.photographs = photographs;
	//}

	// GETTERIT
	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUsername() {
		return username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}
	
	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public boolean isEnabled() {
		return enabled;
	}
	/*public List<Photograph> getPhotographs() {
		return photographs;
	}
*/


	
}
