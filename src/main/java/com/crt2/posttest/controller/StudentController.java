package com.crt2.posttest.controller;

import com.crt2.posttest.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Binding;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @PostMapping
    public ResponseEntity<String> createStudent(
            @Valid @RequestBody StudentDTO student , BindingResult result
            ){
        if (result.hasErrors()) {
            return ResponseEntity.badRequest()
                    .body(result.getFieldError().getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student created Successfully");
    }
}
