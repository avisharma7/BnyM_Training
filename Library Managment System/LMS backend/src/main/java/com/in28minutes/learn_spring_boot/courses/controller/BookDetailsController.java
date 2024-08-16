package com.in28minutes.learn_spring_boot.courses.controller;

import com.in28minutes.learn_spring_boot.courses.model.BookDetails;
import com.in28minutes.learn_spring_boot.courses.repository.BookDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookdetails")
public class BookDetailsController {

    @Autowired
    private BookDetailsRepository bookDetailsRepository;

    // Get all book details
    @GetMapping("/fetch")
    public List<BookDetails> getAllBookDetails() {
        return bookDetailsRepository.findAll();
    }

    // Get count of book details
    @GetMapping("/count")
    public long getBookDetailsCount() {
        return bookDetailsRepository.count();
    }

    // Get book details by ID
    @GetMapping("/{id}")
    public BookDetails getBookDetailsById(@PathVariable Long id) {
//        return bookDetailsRepository.getBookDetailsById(id).orElseThrow(() -> new RuntimeException("BookDetails not found with id: " + id));
        Optional<BookDetails> bookDetails =  bookDetailsRepository.findById(id);
        if(bookDetails.isEmpty()){
            throw new RuntimeException("Book detail not found with id: "+ id);
        }
        return bookDetails.get();
    }

    // Create new book details
    @PostMapping
    public BookDetails createBookDetails(@RequestBody BookDetails bookDetails) {
        return bookDetailsRepository.save(bookDetails);
    }

    // Update existing book details
    @PutMapping("/{id}")
    public void updateBookDetails(@PathVariable Long id, @RequestBody BookDetails bookDetails) {
        bookDetails.setId(id);
        bookDetailsRepository.save(bookDetails); // Using .save  for both create and update
    }

    // Delete book details
    @DeleteMapping("/{id}")
    public void deleteBookDetails(@PathVariable Long id) {
        bookDetailsRepository.deleteById(id);
    }
}
