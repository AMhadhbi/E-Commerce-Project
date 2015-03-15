package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable {
	private Long idUser;
	private String userName;
	private String password;
	private boolean activated;
	private Collection<Role> roles;
	
	
	public User() {
		super();
	}
	
	public User(String userName, String password, boolean activated) {
		super();
		this.userName = userName;
		this.password = password;
		this.activated = activated;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}
