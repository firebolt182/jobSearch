package org.javaacademy.jobSearch.service;

import java.math.BigDecimal;
import java.util.List;
import org.javaacademy.jobSearch.company.Company;
import org.javaacademy.jobSearch.vacancy.Vacancy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("japan | china")
public class VacancyService {
    @Value("${vacancy.service.currency}")
    String currency;

    public Company createCompany(String name) {
        return new Company(name);
    }

    public void createVacancy(Company company, String position,
                              String description, BigDecimal salary) {
        company.getVacancies()
                .add(new Vacancy(position, description, salary, currency));
    }

    public List<Vacancy> giveVacancies(Company company) {
        return company.getVacancies();
    }

}
