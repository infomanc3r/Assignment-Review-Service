package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.exceptions.ResourceNotFoundException;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/assignments")
public class AssignmentController {
    @Autowired
    AssignmentService assignmentService;

    @GetMapping
    public List<Assignment> getAssignmentsByUser() {
        return assignmentService.getAllAssignments();
    }

    @GetMapping("{id}")
    public Assignment getAssignmentById(@PathVariable("id") Long assignmentId) {
        return assignmentService.getAssignment(assignmentId)
                .orElseThrow(() -> new ResourceNotFoundException("No Assignment found with that id!"));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> putAssignmentById(@RequestBody Assignment assignment,
                                               @PathVariable("id") Long assignmentId) {
        assignmentService.updateAssignment(assignment);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> postAssignment(@RequestBody Assignment assignment) {
        assignmentService.addAssignment(assignment);
        return ResponseEntity.ok().build();
    }

}