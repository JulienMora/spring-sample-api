package com.julien.freeCodeCamp.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "julien", LocalDate.of(1996, Month.JULY, 6), 26, "jul@gmail.com"));
    }
}
