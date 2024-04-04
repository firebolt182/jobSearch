package org.javaacademy.jobSearch.company;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.javaacademy.jobSearch.vacancy.Vacancy;

@RequiredArgsConstructor
public class Company {
    @NonNull
    private String name;
    @Getter
    private List<Vacancy> vacancies = new ArrayList<>();
}
