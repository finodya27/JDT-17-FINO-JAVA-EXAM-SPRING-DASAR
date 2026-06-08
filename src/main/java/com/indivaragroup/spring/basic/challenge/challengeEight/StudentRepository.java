package com.indivaragroup.spring.basic.challenge.challengeEight;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
    }

    public Student findById(Integer id) {
        for(Student student : students) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public List<Student> findAll() {
        return students;
    }
}
