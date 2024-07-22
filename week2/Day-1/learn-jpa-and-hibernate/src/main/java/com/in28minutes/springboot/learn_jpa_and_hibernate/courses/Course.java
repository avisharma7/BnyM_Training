package com.in28minutes.springboot.learn_jpa_and_hibernate.courses;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;


//mapping course entity to course table
@Entity
public class Course {

    @Id
    private long id;
    private String name;
    private String author;

    //constructor
    //getter
    //tostring
    public Course(){

    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
