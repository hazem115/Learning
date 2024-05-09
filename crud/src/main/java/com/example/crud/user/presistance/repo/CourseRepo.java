package com.example.crud.user.presistance.repo;

import com.example.crud.user.presistance.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course , Long> {
}
