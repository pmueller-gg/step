package com.google.sps.classes;

public class LoginHandler {
    private boolean logged = false;
    private String link = "";
    public LoginHandler(boolean logged, String link){
        this.logged = logged;
        this.link = link;
    }
}
