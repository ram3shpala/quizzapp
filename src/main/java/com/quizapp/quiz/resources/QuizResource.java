package com.quizapp.quiz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.quiz.entity.Quiz;
import com.quizapp.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz/")
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
        System.out.println("Hello Index");
        return "index";
    }
}
