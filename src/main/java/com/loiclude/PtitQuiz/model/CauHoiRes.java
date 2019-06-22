package com.loiclude.PtitQuiz.model;

import java.util.List;

public class CauHoiRes {
	private List<String> questions;
	private List<String> answers;
	private List<String> correctAnswers;
	
	public CauHoiRes(List<String> questions, List<String> answers, List<String> correctAnswers) {
		super();
		this.questions = questions;
		this.answers = answers;
		this.correctAnswers = correctAnswers;
	}
	public List<String> getQuestions() {
		return questions;
	}
	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	public List<String> getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(List<String> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
}
