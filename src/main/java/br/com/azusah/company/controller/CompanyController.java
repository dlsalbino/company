package br.com.azusah.company.controller;

import br.com.azusah.company.model.Company.Company;
import br.com.azusah.company.service.CompanyService.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "secured/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService service;

    @GetMapping
    Collection<Company> getAll() {
        return service.getAll();
    }
}
