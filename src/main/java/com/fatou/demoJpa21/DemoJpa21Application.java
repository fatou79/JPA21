package com.fatou.demoJpa21;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.demoJpa21.Repository.CourseRepository;
import com.fatou.demoJpa21.entity.Course;

@SpringBootApplication
public class DemoJpa21Application implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	public CourseRepository diagne;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = diagne.findById(10001L);
		
		logger.info("Course 10001 -> {}", course);
		
		diagne.deletedById(10001L);
	}

}
