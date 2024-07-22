package com.in28minutes.springboot.learn_jpa_and_hibernate.courses;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.courses.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.courses.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn DSA Now", "Aviral Pathak"));
        repository.save(new Course(2, "Learn OS Now", "Sakshi Pathak"));
        repository.save(new Course(3, "Learn DBMS Now", "Avisak Pathak"));
        repository.deleteById(2l);
//        repository.delete(3);

        System.out.println(repository.findById(1l)); // Should print course with id 1
        System.out.println(repository.findById(2l)); // Should print "Course with id 2 not found."
        System.out.println(repository.findById(3l)); // Should print "Course with id 3 not found."
        System.out.println(repository.findAll());
        System.out.println(repository.count()); //like count(*)
        System.out.println(repository.findByAuthor("Avisak Pathak"));
        System.out.println(repository.findByAuthor(""));
        System.out.println("----------------------");
        System.out.println(repository.findByName("Learn DSA Now"));
        System.out.println(repository.findByName(""));
    }
}
