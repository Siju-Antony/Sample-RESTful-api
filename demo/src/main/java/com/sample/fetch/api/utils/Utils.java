/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.utils;

import java.util.Arrays;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 *
 * @author Siju
 */
public class Utils {

    public static HttpEntity<HttpHeaders> getHttpEntity() {
        return new HttpEntity<>(getHttpHeaders());
    }

    public static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("contentType", MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setCacheControl(CacheControl.noCache());
        return headers;
    }
}
