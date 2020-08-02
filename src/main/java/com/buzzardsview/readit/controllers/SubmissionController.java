package com.buzzardsview.readit.controllers;

import com.buzzardsview.readit.data.SubmissionRepository;
import com.buzzardsview.readit.models.Submission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubmissionController {

    private final SubmissionRepository repository;

    public SubmissionController(SubmissionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/submissions")
    List<Submission> all() {
        return repository.findAll();
    }
}
