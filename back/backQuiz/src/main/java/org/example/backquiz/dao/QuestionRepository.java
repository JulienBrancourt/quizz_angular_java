package org.example.backquiz.dao;

import org.example.backquiz.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
}
