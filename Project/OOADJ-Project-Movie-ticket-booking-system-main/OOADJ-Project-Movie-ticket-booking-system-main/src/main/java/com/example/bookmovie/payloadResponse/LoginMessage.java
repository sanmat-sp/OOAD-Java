package com.example.bookmovie.payloadResponse;

public class LoginMessage {
    String message;
    String userStatus;
    String email;
    Boolean status;

    @Override
    public String toString() {
        return "LoginMessage [message=" + message + ", userStatus=" + userStatus + ", email=" + email + ", status="
                + status + "]";
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LoginMessage(String message, Boolean status, String email, String userStatus) {
        this.message = message;
        this.status = status;
        this.email = email;
        this.userStatus = userStatus;
    }

}
