package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.exam.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
