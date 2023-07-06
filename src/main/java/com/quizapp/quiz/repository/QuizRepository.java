package com.quizapp.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.quiz.entity.Quiz;
@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
    
}
