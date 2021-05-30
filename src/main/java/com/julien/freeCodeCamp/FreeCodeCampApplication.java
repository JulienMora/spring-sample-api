package com.julien.freeCodeCamp;

import com.julien.freeCodeCamp.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class FreeCodeCampApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreeCodeCampApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(new Student(1L, "julien", LocalDate.of(1996, Month.JULY, 6), 26, "jul@gmail.com"));
	}

}
