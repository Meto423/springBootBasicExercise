package com.example.demoapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
           Student metin = new Student(
                    "Metin",
                    "metinkutay1@gmail.com",
                    LocalDate.of(2003, Month.MAY, 20)
            );

            Student berna = new Student(
                    "Berna",
                    "brnametin@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 3)
            );

            studentRepository.saveAll(
                    List.of(metin,berna)
                    );

        };


    }
}
