package org.javaacademy.jobSearch.service;

import java.math.BigDecimal;
import java.util.List;
import org.javaacademy.jobSearch.resume.Resume;
import org.javaacademy.jobSearch.user.User;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    public User createUser(String name, String mail) {
        return new User(name, mail);
    }

    public void createResume(User user, String description, BigDecimal salary) {
        user.setResume(new Resume(description, salary));
    }

    public List<Resume> giveResumeList(List<Resume> resumeList) {
        return resumeList;
    }
}
