package com.codeki.vuelosapi.service;

import com.codeki.vuelosapi.exceptions.ResourceNotFoundExceptions;
import com.codeki.vuelosapi.model.Company;
import com.codeki.vuelosapi.repository.CompanyRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    public Optional<Company> getCompanyByName(String name) {
        return companyRepository.findByName(name);
    }

    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompanyById(Long id) {
        Company company = companyRepository.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("company","id", id));
        companyRepository.deleteById(company.getId());
    }

    public Optional<Company> updateCompany(Company company){
        companyRepository.save(company);
        return companyRepository.findById(company.getId());
    }
}
