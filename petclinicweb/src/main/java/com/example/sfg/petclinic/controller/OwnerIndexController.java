package com.example.sfg.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerIndexController {

    @RequestMapping({"/owners","/owners/index","owners/index.html"})
    public String ownerIndex() {
        return "owners/index.html";
    }
}
