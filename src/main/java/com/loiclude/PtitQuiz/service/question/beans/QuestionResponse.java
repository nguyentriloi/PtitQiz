package com.loiclude.PtitQuiz.service.question.beans;

import com.loiclude.PtitQuiz.service.answer.beans.AnswerResponse;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class QuestionResponse {

    private int id;

    @NotEmpty
    private String name;

    private List<AnswerResponse> answers;

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

    public List<AnswerResponse> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerResponse> answers) {
        this.answers = answers;
    }
}
