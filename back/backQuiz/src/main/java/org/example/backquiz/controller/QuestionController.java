package org.example.backquiz.controller;


import org.example.backquiz.entity.Question;
import org.example.backquiz.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("registerquestion")
    public ResponseEntity<Question> registerQuestion(@RequestBody Question question) {
        Question newQuestion = questionService.save(question);
        //return ResponseEntity.ok().body(newQuestion);
        return ResponseEntity.ok(newQuestion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Question>> getQuestionById(@PathVariable("id") int id) {
        return ResponseEntity.ok(questionService.findById(id));
    }


}
