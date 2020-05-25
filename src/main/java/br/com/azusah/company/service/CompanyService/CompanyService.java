package br.com.azusah.company.service.CompanyService;

import br.com.azusah.company.model.Company.Company;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class CompanyService {
    public Collection<Company> getAll() {
        return Arrays.asList(Company.builder().name("Azusah Tech").build(),
                Company.builder().name("Azusah Clothes").build());
    }
}
