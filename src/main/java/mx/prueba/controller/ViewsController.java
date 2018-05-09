/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Developer
 */
@Controller
public class ViewsController {
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexView()throws Exception{
        return "index";
    }
}
