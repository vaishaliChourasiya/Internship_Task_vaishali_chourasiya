package com.user.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.Entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
