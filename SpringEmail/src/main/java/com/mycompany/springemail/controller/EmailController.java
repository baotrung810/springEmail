/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springemail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author AnhLe
 */
@Controller
public class EmailController {

    @RequestMapping(value = "/emailform", method = RequestMethod.GET)
    public String showFormSentEmail(Model model) {
        return "emailForm";
    }
}
