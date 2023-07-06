package com.kodekollab.quizapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodekollab.quizapp.entity.Quiz;
@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
    
}
