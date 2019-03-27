package com.loiclude.PtitQuiz.model;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "answer_true")
    private Integer answerTrue;

    @Column(name = "question_id")
    private Integer questionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(Integer answerTrue) {
        this.answerTrue = answerTrue;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
