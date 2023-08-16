/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.usermanagementproject;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class User implements Serializable{
    private int id;
    private String login;
    private String name;
    private String password;
    private char gender;
    private char role;
    private static int lastID = 1;

    public User(String login, String name, String password, char gender, char role) {
        this(User.lastID++, login, name, password, gender, role);
    }

    public User(int id,String login, String name, String password, char gender, char role) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }

    public static int getLastID() {
        return lastID;
    }

    public static void setLastID(int lastID) {
        User.lastID = lastID;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", name=" + name + ", password=" + password + ", gender=" + gender + ", role=" + role + '}';
    }
    
    
}
