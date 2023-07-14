package com.quizapp.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
@lombok.ToString
@Entity
@Table(name = "quiz")
public class Quiz {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Column(name = "id")
    private Long id;
    @jakarta.persistence.Column(name = "question")
    private String question;
    @jakarta.persistence.Column(name = "option1")
    private String option1;
    @jakarta.persistence.Column(name = "option2")
    private String option2;
    @jakarta.persistence.Column(name = "option3")
    private String option3;
    @jakarta.persistence.Column(name = "option4")
    private String option4;
    @NotBlank(message = "Answer is mandatory")
    @jakarta.persistence.Column(name = "answer")
    private String answer;
}