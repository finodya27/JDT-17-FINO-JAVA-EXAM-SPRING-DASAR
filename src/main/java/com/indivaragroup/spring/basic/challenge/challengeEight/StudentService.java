package com.indivaragroup.spring.basic.challenge.challengeEight;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void addStudent(Integer id, String name) {
        studentRepository.save(new Student(id, name));
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}