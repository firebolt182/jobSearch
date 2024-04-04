package org.javaacademy.jobSearch.service;

import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.javaacademy.jobSearch.company.Company;
import org.javaacademy.jobSearch.resume.Resume;
import org.javaacademy.jobSearch.user.User;
import org.javaacademy.jobSearch.vacancy.Vacancy;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class JobSearchService {
    private ResumeService resumeService;
    private VacancyService vacancyService;

    public User createUser(@NonNull String name, @NonNull String mail) {
        return resumeService.createUser(name, mail);
    }

    public void createResume(@NonNull User user,
                             @NonNull String description,
                             @NonNull BigDecimal salary) {
        resumeService.createResume(user, description, salary);
    }

    public List<Resume> giveResumeList(List<Resume> resumeList) {
        return resumeService.giveResumeList(resumeList);
    }

    public Company createCompany(@NonNull String name) {
        return vacancyService.createCompany(name);
    }

    public void createVacancy(@NonNull Company company,
                              @NonNull String position,
                              @NonNull String description,
                              @NonNull BigDecimal salary) {
        vacancyService.createVacancy(company, position, description, salary);
    }

    public List<Vacancy> giveVacancies(@NonNull Company company) {
        return vacancyService.giveVacancies(company);
    }
}
