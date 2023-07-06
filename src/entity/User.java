package com.kodekollab.quizapp.entity;

public record User(String userString, String emailString) {
    public User {
        if (userString == null || userString.isBlank()) {
            throw new IllegalArgumentException("User name cannot be null or blank");
        }
        if (emailString == null || emailString.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
    }
    
    public String getUserString() {
        return userString;
    }   

    public String getEmailString() {
        return emailString;
    }

    @Override  
    public String toString() {
        return "User{" + "userString=" + userString + ", emailString=" + emailString + '}';
    }
    
    
}
