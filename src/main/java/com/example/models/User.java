/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.models;

import org.springframework.data.annotation.Id;
import java.io.Serializable;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ishan
 */
@Document(collection="users")
public class User implements Serializable{
    
    @Id
    public String id;
    
    public String username;
    public String password;
    
    public User(){};
    
    public User(String uname, String pw){
        this.username = uname;
        this.password = pw;
    }
    
    @Override
    public String toString() {
        return String.format("User[id=%s,username=%s,password=%s]", id,username,password);
    }

}
