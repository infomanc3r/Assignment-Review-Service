package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/assignments")
public class AssignmentController {
    @Autowired
    HelloService helloService;
    @GetMapping
    ResponseEntity<?> welcomeLearner() {
        Assignment greeting = helloService.greetLearner();
        return ResponseEntity.ok(greeting);
    }
}