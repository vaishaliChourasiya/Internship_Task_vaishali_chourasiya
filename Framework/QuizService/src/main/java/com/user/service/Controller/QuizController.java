package com.user.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.Entity.Quiz;
import com.user.service.serviceimp.QuizServiceImp;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizServiceImp qs;
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		
		return qs.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> getAll(){
		return qs.get();
		
	}
	
	@GetMapping("/{id}")
	public Quiz get(@PathVariable Long id){
		return qs.get(id);
		
	}
}
