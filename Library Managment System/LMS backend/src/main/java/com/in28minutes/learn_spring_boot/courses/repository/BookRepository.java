package com.in28minutes.learn_spring_boot.courses.repository;

import com.in28minutes.learn_spring_boot.courses.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
}
