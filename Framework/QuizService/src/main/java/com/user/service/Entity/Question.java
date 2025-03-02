package com.user.service.Entity;

import org.springframework.stereotype.Component;



@Component
public class Question {

	private Long questionId;
	private String question;
	private Long quizId;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String question, Long quizId) {
		super();
		this.question = question;
		this.quizId = quizId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", quizId=" + quizId + "]";
	}

}
