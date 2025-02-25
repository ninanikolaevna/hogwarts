package com.example.pro.sky.hogwarts.service;

import com.example.pro.sky.hogwarts.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FacultyServiceImpl implements FacultyService {
    private final HashMap<Long, Faculty> faculties = new HashMap<>();
    private long count = 0;

    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty findFaculty(long id) {
        return null;
    }

    public Faculty findFacultyById(long id) {
        return faculties.get(id);
    }
    public Faculty editFaculty(long id,Faculty faculty) {
        if(!faculties.containsKey(id)) {
            return null;
        }
        faculties.put(id, faculty);
        return faculty;
    }
   public void deleteFaculty (long id) {
        faculties.remove(id);
   }
}
