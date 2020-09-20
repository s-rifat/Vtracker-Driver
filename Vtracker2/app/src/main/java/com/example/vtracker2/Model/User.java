package com.example.vtracker2.Model;

import java.util.HashMap;

public class User {
    private String uid,email, rout,busName;
    private HashMap<String,User> acceptList;//List user friend

    public User() {
    }

    public String getRout() {
        return rout;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public User(String uid, String email, String rout, String busName) {
        this.uid = uid;
        this.email = email;
        acceptList = new HashMap<>();
        this.rout = rout;
        this.busName = busName;
    }

    public String getUid() {
        return uid;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, User> getAcceptList() {
        return acceptList;
    }

    public void setAcceptList(HashMap<String, User> acceptList) {
        this.acceptList = acceptList;
    }
}
