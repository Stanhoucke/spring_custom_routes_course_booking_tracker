package com.codeclan.example.coursebooker.controllers;

import com.codeclan.example.coursebooker.models.Course;
import com.codeclan.example.coursebooker.repositories.CourseRepository;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<> (courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id) {
        return new ResponseEntity(courseRepository.findById(id), HttpStatus.OK);
    }
}
