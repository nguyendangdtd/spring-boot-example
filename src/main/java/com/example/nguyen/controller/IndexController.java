/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author XV
 */
@RestController
public class IndexController {
    
    @RequestMapping("/")
    public String hello() {
        return "Chao cac ban nhe";
    }
    
}
