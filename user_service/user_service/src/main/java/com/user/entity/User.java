package com.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class User {

    private  Long userId;
    private String phone;
    private String name;
    List<Contact> contacts = new ArrayList<Contact>();

    public User(Long userId, String phone, String name, List<Contact> contacts) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
        this.contacts = contacts;
    }

    public User(Long userId, String phone, String name) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
    }

    public User() {
    }
}
