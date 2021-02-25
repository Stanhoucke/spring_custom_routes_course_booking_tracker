package com.codeclan.example.coursebooker.repositories;

import com.codeclan.example.coursebooker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
