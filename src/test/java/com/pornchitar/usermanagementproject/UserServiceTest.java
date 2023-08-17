/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pornchitar.usermanagementproject;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class UserServiceTest {
    UserService userService;
    public UserServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        userService = new UserService();
        User newAdmin = new User("admin", "Adminnistrator", "pass@1234", 'M', 'A');
        User newUser1 = new User("user1", "User 1", "pass@1234", 'M', 'U');
        User newUser2 = new User("user2", "User 2", "pass@1234", 'M', 'U');
        User newUser3 = new User("user3", "User 3", "pass@1234", 'M', 'U');
        User newUser4 = new User("user4", "User 4", "pass@1234", 'M', 'U');
        userService.addUser(newAdmin);
        userService.addUser(newUser1);
        userService.addUser(newUser2);
        userService.addUser(newUser3);
        userService.addUser(newUser4);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User newUser = new User("admin", "Adminnistrator", "pass@1234", 'M', 'A');
        UserService instance = new UserService();
        User expResult = newUser;
        User result = instance.addUser(newUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, result.getId());
        User newUser2 = new User("user1", "User 1", "pass@1234", 'M', 'A');
        User result2 = instance.addUser(newUser2);
        assertEquals(2, result2.getId());
    }

    /**
     * Test of getUser method, of class UserService.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        int index = 1;
        String expResult = "user1";
        User result = userService.getUser(index);
        assertEquals(expResult, result.getLogin());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUsers method, of class UserService.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        ArrayList<User> userList = userService.getUsers();
        assertEquals(5, userList.size());
    }

    /**
     * Test of getSize method, of class UserService.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        int expResult = 5;
        int result = userService.getSize();
        assertEquals(expResult, result);
    }
    
}
