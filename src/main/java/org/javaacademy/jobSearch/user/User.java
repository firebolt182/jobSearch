package org.javaacademy.jobSearch.user;

import lombok.Data;
import lombok.NonNull;
import org.javaacademy.jobSearch.resume.Resume;

@Data
public class User {
    @NonNull
    private final String name;
    @NonNull
    private String mail;

    private Resume resume;
}
