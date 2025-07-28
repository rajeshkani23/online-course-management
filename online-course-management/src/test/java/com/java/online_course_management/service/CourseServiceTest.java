package com.java.online_course_management.service;

import com.java.online_course_management.Service.CourseService;
import com.java.online_course_management.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    void testCreateCourse() {
        Course course = new Course();
        course.setTitle("Test Course");
        course.setDescription("JUnit Test Description");

        Course saved = courseService.createCourse(course);
        assertNotNull(saved.getId());
        assertEquals("Test Course", saved.getTitle());
    }

    @Test
    void testGetAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        assertNotNull(courses);
    }
}

