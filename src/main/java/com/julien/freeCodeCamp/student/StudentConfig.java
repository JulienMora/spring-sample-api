package com.julien.freeCodeCamp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student julien = new Student("julien", LocalDate.of(1994, Month.JULY, 6), 26, "jul@gmail.com");
            Student toto = new Student("toto", LocalDate.of(1996, Month.JULY, 6), 26, "toto@toto.com");

            repository.saveAll(List.of(julien, toto));
        };
    }
}
