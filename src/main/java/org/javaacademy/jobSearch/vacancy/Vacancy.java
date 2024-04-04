package org.javaacademy.jobSearch.vacancy;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class Vacancy {
    @NonNull
    private final String position;
    @NonNull
    private String description;
    @NonNull
    private BigDecimal salary;
    @NonNull
    private String currency;

    public Vacancy(@NonNull String position,
                   @NonNull String description,
                   @NonNull BigDecimal salary,
                   @NonNull String currency) {
        this.position = position;
        this.description = description;
        this.salary = salary;
        this.currency = currency;
    }
}
