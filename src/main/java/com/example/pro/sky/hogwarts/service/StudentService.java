package com.example.pro.sky.hogwarts.service;

import com.example.pro.sky.hogwarts.model.Student;

public interface StudentService {
    Student findStudent(long id);
    Student editStudent(long id, Student student);
    void deleteStudent(long id);
    Student addStudent(Student student);
}
