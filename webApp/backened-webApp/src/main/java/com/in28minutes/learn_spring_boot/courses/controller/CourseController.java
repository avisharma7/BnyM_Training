package com.in28minutes.learn_spring_boot.courses.controller;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    //http://localhost::8080/courses
    /*

    [
    {
    "id":1,
    "name":"Learn Microservices",
    "author": "in28minutes"
    }
    ]

         */
    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course>getAllCourses(){
       // return Arrays.asList(
            //    new Course(1,"Learn Microservices","in28minutes"),
                //new Course(2, "Full stack", "Aviral Sharma"));

                //now get the data from the database
        return repository.findAll();

    }

    //getting the count of the course
    @GetMapping("/courses/count")
    public long getCount(){
        // return Arrays.asList(
        //    new Course(1,"Learn Microservices","in28minutes"),
        //new Course(2, "Full stack", "Aviral Sharma"));

        //now get the data from the database
        return repository.count();


    }

    //http://localhost::8080/courses/1
        @GetMapping("/courses/{id}")
        public Course getCourseDetails(@PathVariable long id){
            Optional<Course> course =  repository.findById(id);
            if(course.isEmpty()){
                throw new RuntimeException("Course not found with id: "+ id);
            }
            return course.get();
        }

    /*
    HTTP METHODS
    1) Get - Retrieve info.
    2) post- update/replace a resource
    3) patch - update a part of the resource
    4) delete- delete a resource
     */

    //post - create a new resource

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    //update - updating course
    @PutMapping("courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course){
        repository.save(course);

    }

    //delete - to delete a resource
    @DeleteMapping("courses/{id}")
    public void deleteCourse(@PathVariable long id){
        repository.deleteById(id);
    }

    




}
