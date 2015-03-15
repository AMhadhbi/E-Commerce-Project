package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable {
	private Long idUser;
	private String userName;
	private String password;
	private boolean activated;
	private Collection<Role> roles;

}
