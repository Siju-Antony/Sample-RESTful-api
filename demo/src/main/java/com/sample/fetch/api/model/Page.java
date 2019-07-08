/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.fetch.api.model;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Siju
 */
@Data
public class Page {

    private Integer page;
    private Integer perPage;
    private Integer total;
    private Integer totalPages;
    private List<User> data = null;

    public Page() {
    }

    public Page(Integer page, Integer perPage, Integer total, Integer totalPages) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
    }

}
