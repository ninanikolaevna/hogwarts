package com.example.pro.sky.hogwarts.repository;

import com.example.pro.sky.hogwarts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findByAgeBetween(int fromAge, int toAge);
}
