package com.codeki.vuelosapi.controller;

import com.codeki.vuelosapi.model.Company;
import com.codeki.vuelosapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("")
    public List<Company> getAllCompany(){
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Optional<Company> findCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }

    @GetMapping("/name")
    public Optional<Company> getCompanyByName(@RequestParam String name){
        return companyService.getCompanyByName(name);
    }


}
