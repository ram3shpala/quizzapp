package com.quizapp.quiz.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Quiz> getAllQuestions() {
        return quizService.getAllQuestions();
    }

    @GetMapping("/quiz/{id}")
    public Quiz findQuestionById(@PathVariable("id") Long id) {
        return quizService.findQuestionById(id);
    }

    // @GetMapping("/quiz")
    // public String showQuiz(Model model) {
    // model.addAttribute("quizStarted", false);
    // return "quiz";
    // }

    @PostMapping("/startQuiz")
    public String startQuiz(Model model) {
        // Fetch quiz questions from the server or any other necessary logic
        List<Quiz> quizQuestions = quizService.getAllQuestions();

        model.addAttribute("quizStarted", true);
        model.addAttribute("currentQuestion", quizQuestions.get(0));
        model.addAttribute("currentQuestionIndex", 0);

        return "index";
    }

    @PostMapping("/quiz")
    public String submitQuizAnswer(@RequestParam("answer") String answer,
            @RequestParam("currentIndex") String currentIndex, Model model) {

        List<Quiz> quizQuestions = quizService.getAllQuestions();

        int tempCurrentIndex = Integer.parseInt(currentIndex);
        model.addAttribute("quizStarted", true);
        
        if(tempCurrentIndex < quizQuestions.size()) {
            model.addAttribute("currentQuestion", quizQuestions.get(tempCurrentIndex));
            model.addAttribute("currentQuestionIndex", tempCurrentIndex);
        } else {
            model.addAttribute("quizCompleted", true);
             model.addAttribute("score", 2);
        }
        return "index";
    }
}
