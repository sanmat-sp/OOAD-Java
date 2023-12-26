package com.example.bookmovie.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
    // private static final GenerationType GenerationType = null;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginId;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public Login() {
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login [email=" + email + ", password=" + password + "]";
    }

}
