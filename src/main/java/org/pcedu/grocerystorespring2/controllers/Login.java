/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.grocerystorespring2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author George.Pasparakis
 */
@Controller
@RequestMapping("/")
public class Login {
    
    @RequestMapping(value = {"/", "/login"}, method={RequestMethod.GET})
    // localhost:8085/
    // localhost:8085/login
    public String login(ModelMap view) {
        view.addAttribute("projectName", "Grocery Store");
        return("login");
    }
}
