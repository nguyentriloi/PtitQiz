package com.loiclude.PtitQuiz.service.subject.beans;

import com.loiclude.PtitQuiz.service.question.beans.QuestionResponse;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class SubjectResponse {
    private int id;

    @NotEmpty
    private String name;
    private List<QuestionResponse> questions;

    public List<QuestionResponse> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionResponse> questions) {
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
