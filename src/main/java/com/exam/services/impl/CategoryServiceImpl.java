package com.exam.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.exam.model.exam.Category;
import com.exam.repo.CategoryRepository;
import com.exam.services.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return this.categoryRepository.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		return new LinkedHashSet<Category>(this.categoryRepository.findAll());
	}

	@Override
	public Category getCategory(Long categoryId) {
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void deleteCategory(Long categoryId) {
		Category cat = new Category();
		cat.setCid(categoryId);
		this.categoryRepository.delete(cat);
		
	}	
}
