package com.in28minutes.springboot.learn_jpa_and_hibernate.courses.springdatajpa;

import com.in28minutes.springboot.learn_jpa_and_hibernate.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
//must needed incase of Spring data jpa

    //search by author
    List<Course>findByAuthor(String author);

    //search by course name => name
    List<Course> findByName(String name);

}
