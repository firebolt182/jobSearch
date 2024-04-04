package org.javaacademy.jobSearch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.javaacademy.jobSearch.company.Company;
import org.javaacademy.jobSearch.resume.Resume;
import org.javaacademy.jobSearch.service.JobSearchService;
import org.javaacademy.jobSearch.service.ResumeService;
import org.javaacademy.jobSearch.service.VacancyService;
import org.javaacademy.jobSearch.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class JobSearchServiceTest {
    @Autowired
    private JobSearchService jobSearchService;

    @MockBean
    private ResumeService resumeService;

    @MockBean
    private VacancyService vacancyService;

    @Test
    void createUserSuccess() {
        Assertions.assertDoesNotThrow(() -> jobSearchService
                .createUser("test", "test@test.ru"));
    }

    @Test
    void createResumeSuccess() {
        Assertions.assertDoesNotThrow(() -> jobSearchService
                .createResume(new User("test", "test"),
                        "description", BigDecimal.valueOf(Long.parseLong("22"))));
    }

    @Test
    void createResumeFail() {
        Assertions.assertThrows(NumberFormatException.class, () -> jobSearchService
                .createResume(new User("test", "test"),
                        "description", BigDecimal.valueOf(Long.parseLong("63L"))));
    }

    @Test
    void giveResumeListTest() {
        List<Resume> resumeList = jobSearchService.giveResumeList(new ArrayList<>());
        Assertions.assertEquals(0, resumeList.size());
    }

    @Test
    void createCompanySuccess() {
        Assertions.assertDoesNotThrow(() -> jobSearchService
                .createCompany("test"));
    }

    @Test
    void createVacancySuccess() {
        Assertions.assertDoesNotThrow(() -> jobSearchService
                .createVacancy(new Company("company"),
                        "position", "description", BigDecimal.valueOf(23)));
    }

    @Test
    void createVacancyFail() {
        Assertions.assertThrows(NumberFormatException.class, () -> jobSearchService
                .createVacancy(new Company("company"),
                        "position", "description",
                        BigDecimal.valueOf(Long.parseLong("34L"))));
    }

    @Test
    void giveVacanciesSuccess() {
        Assertions.assertDoesNotThrow(() ->
                jobSearchService.giveVacancies(new Company("company")));
    }
}