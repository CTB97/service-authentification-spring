package com.ctb.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserApp {
    @Id
    private  Long id;
    private String userName;
    private  String password;
}
