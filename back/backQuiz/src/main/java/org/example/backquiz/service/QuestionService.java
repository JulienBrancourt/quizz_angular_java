package org.example.backquiz.service;

import org.example.backquiz.dao.QuestionRepository;
import org.example.backquiz.entity.Question;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question save(Question question) {
        return questionRepository.save(question);
    }

    public Optional<Question> findById(int id) {
        return questionRepository.findById(id);
    }

}
