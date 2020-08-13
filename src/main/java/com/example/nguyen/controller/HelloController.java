/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author XV
 */
@Controller
public class HelloController {
    
    @RequestMapping("/index")
    public String hello(Model modal, @RequestParam(value = "name", required = false, defaultValue = "nguyen")
            String name) {
        modal.addAttribute("name", name);
        return "hello";
    }
}
