package com.indivaragroup.spring.basic.challenge.challengeEight;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentRunner {

    private final StudentService studentService;

    public void run() {
        studentService.addStudent(1, "Budi");
        studentService.addStudent(2, "Andi");
        studentService.addStudent(3, "Siti");

        System.out.println("Student List:");

        for (Student student : studentService.getAllStudents()) {
            System.out.println(student.getId() + " - " + student.getName());
        }
    }
}