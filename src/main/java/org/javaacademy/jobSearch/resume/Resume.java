package org.javaacademy.jobSearch.resume;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NonNull;

@Data
public class Resume {
    @NonNull
    private String description;
    @NonNull
    private BigDecimal salary;
}
