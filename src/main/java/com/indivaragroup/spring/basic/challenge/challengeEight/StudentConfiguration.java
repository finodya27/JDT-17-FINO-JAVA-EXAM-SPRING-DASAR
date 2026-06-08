package com.indivaragroup.spring.basic.challenge.challengeEight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentService(studentRepository);
    }

    @Bean
    public StudentRunner studentRunner(StudentService studentService) {
        return new StudentRunner(studentService);
    }

}
