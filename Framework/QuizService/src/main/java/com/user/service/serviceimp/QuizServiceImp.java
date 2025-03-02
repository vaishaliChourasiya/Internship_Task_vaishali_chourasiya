package com.user.service.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.Entity.Question;
import com.user.service.Entity.Quiz;
import com.user.service.Repository.QuizRepository;
import com.user.service.Services.QuestionClient;
import com.user.service.Services.QuizService;

@Service
public class QuizServiceImp implements QuizService {

	@Autowired
	private QuizRepository quizrepo ;
	@Autowired
	private QuestionClient qc;
	@Override
	public Quiz add(Quiz quiz) {
		
		return quizrepo.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizz=quizrepo.findAll();
		quizz.set
		return ;
				
	}

	@Override
	public Quiz get(long id) {
	
		return quizrepo.findById(id).orElseThrow(()->new RuntimeException("Quiz not found Exception"));
	}

}
