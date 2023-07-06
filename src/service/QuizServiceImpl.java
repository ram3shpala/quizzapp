package com.kodekollab.quizapp.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodekollab.quizapp.entity.Quiz;
import com.kodekollab.quizapp.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

    private QuizRepository quizRepository;

    @Autowired
    public QuizServiceImpl(QuizRepository quizRepository) {
        super();
        this.quizRepository = quizRepository;
    }

    @Override
    public List<Quiz> getAllQuestions() {
        //return this.quizRepository.findAll();
        return StreamSupport.stream(this.quizRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
    
}
