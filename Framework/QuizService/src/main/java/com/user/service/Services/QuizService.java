package com.user.service.Services;

import java.util.List;

import com.user.service.Entity.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	
	List<Quiz>get();
	
	Quiz get(long id);
	

}
