/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.usermanagementproject;

/**
 *
 * @author ASUS
 */
public class User {
    private int id;
    private String login;
    private String name;
    private String password;
    private char gender;
    private char role;

    public User(int id,String login, String name, String password, char gender, char role) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.role = role;
    }
    
}
