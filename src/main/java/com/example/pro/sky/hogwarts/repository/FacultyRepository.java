package com.example.pro.sky.hogwarts.repository;

import com.example.pro.sky.hogwarts.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty findByNameIgnoreCaseAndColorIgnoreCase(String name, String color);
}
