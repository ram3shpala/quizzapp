package com.quizapp.quiz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quizapp.quiz.entity.Quiz;
import com.quizapp.quiz.service.QuizService;

@Controller
public class QuizResource {

    private QuizService quizService;

    @Autowired
    public QuizResource(QuizService quizService) {
        super();
        this.quizService = quizService;
    }
    
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Quiz> getAllQuestions()
    {
        return quizService.getAllQuestions();
    }

    @GetMapping("/index")
    public String getHome()
    {
        return "index";
    }
}
