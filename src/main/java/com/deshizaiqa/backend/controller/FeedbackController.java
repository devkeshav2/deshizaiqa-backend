package com.deshizaiqa.backend.controller;

import com.deshizaiqa.backend.entity.Feedback;
import com.deshizaiqa.backend.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin("*")
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Feedback feedback){
        return ResponseEntity.ok(service.saveFeedback(feedback));
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(service.findAll());

    }
}
