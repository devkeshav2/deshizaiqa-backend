package com.deshizaiqa.backend.service;

import com.deshizaiqa.backend.entity.Feedback;
import com.deshizaiqa.backend.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repo;

    public Feedback saveFeedback(Feedback feedback){
        return repo.save(feedback);
    }
}
