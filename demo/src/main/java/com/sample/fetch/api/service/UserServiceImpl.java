/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.fetch.api.utils.RequestResolver;
import com.sample.fetch.api.utils.Utils;
import com.sample.fetch.api.model.Page;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Siju
 */
@Service
@Log4j2
public class UserServiceImpl implements UserService {

    @Autowired
    private RequestResolver reqSolver;

    public void setReqSolver(RequestResolver reqSolver) {
        this.reqSolver = reqSolver;
    }

    @Override
    public List<Page> findAll() {
        URI uri = URI.create("https://api.myjson.com/bins/ytadr?pretty=1");
        ResponseEntity<String> response = reqSolver.executeGetActor(uri, Utils.getHttpEntity(), String.class);
        String userJson = response.getBody();
        List<Page> pageList = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            pageList = mapper.readValue(userJson, List.class);
        } catch (IOException ex) {
            log.info(ex);
        }
        return pageList;
    }

}
