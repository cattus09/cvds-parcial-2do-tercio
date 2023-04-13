package edu.eci.cvds.controllers;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class UsersBean {
    private String password;

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
}
