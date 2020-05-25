package br.com.azusah.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "company")
public class CompanyController {

    @GetMapping
    String getName(){
        return "Welcome to the Azusah Company!";
    }
}
