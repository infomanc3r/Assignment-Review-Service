package com.hcc.services;

import com.hcc.entities.Assignment;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Assign;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepo;

    public List<Assignment> getAllAssignments() {
        return assignmentRepo.findAll();
    }

    public Optional<Assignment> getAssignment(Long id) {
        return assignmentRepo.findById(id);
    }

    public void addAssignment(Assignment assignment) {
        assignmentRepo.save(assignment);
    }

    public void updateAssignment(Assignment assignment) {
        assignmentRepo.save(assignment);
    }

    public void deleteAssignment(Long id) {
        assignmentRepo.deleteById(id);
    }

}
