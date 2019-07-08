/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.controller;

import com.sample.fetch.api.utils.Utils;
import com.sample.fetch.api.model.Page;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.fetch.api.service.UserService;

/**
 *
 * @author Siju
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService usrService;

    public void setEmpService(UserService usrService) {
        this.usrService = usrService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Page>> findAll() {
        List<Page> empList = usrService.findAll();
        return ResponseEntity.status(HttpStatus.OK).headers(Utils.getHttpHeaders()).body(empList);
    }
}
