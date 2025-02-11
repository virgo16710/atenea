package com.ateneaweb.atenea.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/poliza")
@Controller
public class PolizaController {

    @GetMapping("/index")
    public String index() {
        return "poliza/index";
    }

}
