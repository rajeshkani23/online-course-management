package com.java.online_course_management.Controller;

import com.java.online_course_management.Service.EnrollmentService;
import com.java.online_course_management.model.Enrollment;
    

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public ResponseEntity<Enrollment> enroll(@RequestBody Enrollment enrollment) {
        enrollment.setEnrolledDate(java.time.LocalDate.now());
        return new ResponseEntity<>(enrollmentService.enrollStudent(enrollment), HttpStatus.CREATED);
    }
}
