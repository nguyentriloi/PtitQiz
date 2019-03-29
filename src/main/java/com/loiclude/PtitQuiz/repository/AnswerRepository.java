package com.loiclude.PtitQuiz.repository;

import com.loiclude.PtitQuiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findAnswersByQuestionId(Integer questionId);
}
