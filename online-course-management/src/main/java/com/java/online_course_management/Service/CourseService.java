package com.java.online_course_management.Service;

import com.java.online_course_management.model.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getAllCourses();
}
