/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.utils;

import java.net.URI;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Siju
 */
@Component
@Log4j2
public class RequestResolver {

    private static final Integer CONNECT_TIMEOUT = 10 * 1000;
    private static final Integer READ_TIMEOUT = 10 * 1000;

    public <T> ResponseEntity<T> executeGetActor(URI uri, HttpEntity<HttpHeaders> httpEntity, Class<T> type) {
        SimpleClientHttpRequestFactory reqFactory = new SimpleClientHttpRequestFactory();
        reqFactory.setConnectTimeout(CONNECT_TIMEOUT);
        reqFactory.setReadTimeout(READ_TIMEOUT);
        log.info("--> " + uri);
        return new RestTemplate(reqFactory).exchange(uri, HttpMethod.GET, httpEntity, type);
    }
}
