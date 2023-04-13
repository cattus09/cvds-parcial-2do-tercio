package edu.eci.cvds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Config {
    	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ConfigId;
	private String password;

	public Config() {}
	
	public Config(String password) {
		this.password = password;
	}

	public Long getConfigId() {
		return ConfigId;
	}
	public void setConfigId(Long ConfigId) {
		this.ConfigId = ConfigId;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Config other = (Config) obj;
		if (ConfigId == null) {
			if (other.ConfigId != null)
				return false;
		} else if (!ConfigId.equals(other.ConfigId))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}
