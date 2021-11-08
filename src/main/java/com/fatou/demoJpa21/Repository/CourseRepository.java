package com.fatou.demoJpa21.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fatou.demoJpa21.entity.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	
	public Course findById(Long Id) {
		return em.find(Course.class,Id);
	}

}
