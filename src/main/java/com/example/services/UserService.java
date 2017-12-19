/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.models.User;
import java.util.List;

/**
 *
 * @author ishan
 */
public interface UserService {
    User getUserById(String id);
    List<User> getAllUsers();
}
