package edu.eci.cvds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long UsersId;
	private String nameString;

	public Users() {}
	
	public Users(String nameString) {
		this.nameString = nameString;
	}

	public Long getUsersId() {
		return UsersId;
	}
	public void setUsersId(Long UsersId) {
		this.UsersId = UsersId;
	}
	public String getnameString() {
		return nameString;
	}
	public void setnameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (UsersId == null) {
			if (other.UsersId != null)
				return false;
		} else if (!UsersId.equals(other.UsersId))
			return false;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		return true;
	}
}