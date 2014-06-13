package com.precisiontimeentry.precision.model;

public class LoginData {

	private String id = null;
	private String tk_id = null;
	private String username = null;
	private String password = null;
	private String role = null;

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getTk_id() {
		return tk_id;
	}

	public void setTk_id(String tk_id) {
		this.tk_id = tk_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
