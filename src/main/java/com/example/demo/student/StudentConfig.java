package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student("mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, 1, 5));
            Student alex = new Student("alex", "alex@gmail.com", LocalDate.of(1998, 1, 5));
            Student studen3 = new Student("studen3", "studen3@gmail.com", LocalDate.of(1998, 1, 5));
            Student studen4 = new Student("studen4", "studen4@gmail.com", LocalDate.of(1988, 1, 5));
            Student studen5 = new Student("studen5", "studen5@gmail.com", LocalDate.of(1993, 1, 5));
            Student studen6 = new Student("studen6", "studen6@gmail.com", LocalDate.of(2001, 1, 5));
            repository.saveAll(List.of(mariam, alex, studen3, studen4, studen5, studen6));
        };
    }
}
