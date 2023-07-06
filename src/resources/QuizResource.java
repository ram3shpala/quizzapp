package com.kodekollab.quizapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodekollab.quizapp.entity.Quiz;
import com.kodekollab.quizapp.service.QuizService;

@RestController
@RequestMapping("/quiz/")
public class QuizResource {

    private QuizService quizService;

    @Autowired
    public QuizResource(QuizService quizService) {
        super();
        this.quizService = quizService;
    }
    
    @RequestMapping("/all")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Quiz> getAllQuestions()
    {
        return quizService.getAllQuestions();
    }
}
