package com.in28minutes.learn_spring_boot.courses.repository;

import com.in28minutes.learn_spring_boot.courses.model.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDetailsRepository extends JpaRepository<BookDetails, Long> {

}
