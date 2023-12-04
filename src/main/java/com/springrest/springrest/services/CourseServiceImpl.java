package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;


//    List<Course> list;
    public CourseServiceImpl(){

    }

    @Override
    public List<Course> getCourses(){
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(long courseId) {
        return courseDao.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Optional<Course> entity = courseDao.findById(parseLong);
        // Check if the entity exists in the database
        if (entity.isPresent()) {
            // Extract the Course from Optional
            Course course = entity.get();
            // Delete the entity using the CrudRepository's delete method
            courseDao.delete(course);
            // Optionally, you can perform additional actions after deletion
            // For example, logging, notifying, etc.

        }
    }
}
