package com.user.service.Services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.Entity.Question;

@FeignClient(url="http://localhost:8082" ,name="Question-client")
public interface QuestionClient {

	@GetMapping("/question/quiz/{quizId}")
	List<Question>getQuestionOfQuiz(@PathVariable Long quizId);
	
}
