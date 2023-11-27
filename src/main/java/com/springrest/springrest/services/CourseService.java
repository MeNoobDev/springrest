package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();

    public Optional<Course> getCourse(long courseId);
    public Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long l);
}
