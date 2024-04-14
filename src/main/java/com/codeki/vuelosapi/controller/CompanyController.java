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

    @PostMapping("/create")
    @ResponseBody
    public String createCompany(@RequestBody Company company){
        companyService.createCompany(company);
<<<<<<< HEAD
        return "Compañía creada";
=======
        return "Compania creada";
>>>>>>> 0b269abf78cd8091e2210a34988e8d6b98a0a9f9
    }

    @PutMapping("/update")
    public Optional<Company> updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String deleteCompany(@PathVariable Long id){
        companyService.deleteCompanyById(id);
        return "Compania eliminada";
    }
}
