package com.example.pro.sky.hogwarts.service;

import com.example.pro.sky.hogwarts.model.Faculty;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(long id, Faculty faculty);

    void deleteFaculty(long id);

}
