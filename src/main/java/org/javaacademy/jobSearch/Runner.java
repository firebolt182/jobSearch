package org.javaacademy.jobSearch;

import java.math.BigDecimal;
import org.javaacademy.jobSearch.company.Company;
import org.javaacademy.jobSearch.service.VacancyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Runner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
        VacancyService vacancyService = context.getBean(VacancyService.class);
        Company company = vacancyService.createCompany("Company");
        vacancyService.createVacancy(company, "manager", "to manage", BigDecimal.valueOf(32));
        System.out.println(company.getVacancies().get(0).getCurrency());
    }
}
