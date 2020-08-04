package com.buzzardsview.readit.controllers;

import com.buzzardsview.readit.data.SubmissionRepository;
import com.buzzardsview.readit.models.Submission;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/submissions")
    Submission newSubmission(@RequestBody Submission submission) {
        return repository.save(submission);
    }

    @GetMapping("/submissions/{id}")
    Submission one(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/submissions/{id}")
    Submission replaceSubmission(@RequestBody Submission newSubmission, @PathVariable Integer id) {
        return repository.findById(id).map(submission -> {
            submission.setName(newSubmission.getName());
            return repository.save(submission);
        }).orElseGet(() -> {
            newSubmission.setId(id);
            return repository.save(newSubmission);
        });
    }

    @DeleteMapping("/submissions/{id}")
    void deleteSubmission(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
