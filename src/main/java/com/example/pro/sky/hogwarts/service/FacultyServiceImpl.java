package com.example.pro.sky.hogwarts.service;

import com.example.pro.sky.hogwarts.exception.NotFountException;
import com.example.pro.sky.hogwarts.model.Faculty;
import com.example.pro.sky.hogwarts.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public void checkFacultyExists(Long id) {
        if (!facultyRepository.existsById(id)) {
            throw new NotFountException("Error: Факультет с id " + id + " не найден");
        }
    }

    public List<Faculty> findByColor(String color) {
        return facultyRepository.findByColorContainingIgnoreCase(color);
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        checkFacultyExists(id);
        return facultyRepository.findById(id).get();
    }

    @Override
    public Faculty editFaculty(long id, Faculty faculty) {
        checkFacultyExists(id);
        faculty.setId(id);
        return facultyRepository.save(faculty);
    }

    @Override
    public void deleteFaculty(long id) {
        checkFacultyExists(id);
        facultyRepository.deleteById(id);
    }
}
