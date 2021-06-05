package com.julien.freeCodeCamp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            new Student(1L, "julien", LocalDate.of(1996, Month.JULY, 6), 26, "jul@gmail.com");
        };
    }
}
