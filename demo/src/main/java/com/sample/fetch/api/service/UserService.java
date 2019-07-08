/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.service;

import com.sample.fetch.api.model.Page;
import java.util.List;

/**
 *
 * @author Siju
 */
public interface UserService {

    public List<Page> findAll();
    
}
