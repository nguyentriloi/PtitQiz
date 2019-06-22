package com.loiclude.PtitQuiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cauhoi")
public class CauHoi {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "questions")
    private String questions;

    @Column(name = "answers")
    private String answers;
    
    @Column(name = "correct_answers")
    private String correctAnswers;
    
    @Column(name = "id_monhoc")
    private Integer idMonhoc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public String getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(String correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public Integer getIdMonhoc() {
		return idMonhoc;
	}

	public void setIdMonhoc(Integer idMonhoc) {
		this.idMonhoc = idMonhoc;
	}
    
    
}
