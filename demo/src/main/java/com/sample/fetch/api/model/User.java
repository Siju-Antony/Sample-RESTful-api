/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.model;

import lombok.Data;

/**
 *
 * @author Siju
 */
@Data
public class User {

    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;

    public User() {
    }

    public User(Integer id, String email, String firstName, String lastName, String avatar) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }

}
