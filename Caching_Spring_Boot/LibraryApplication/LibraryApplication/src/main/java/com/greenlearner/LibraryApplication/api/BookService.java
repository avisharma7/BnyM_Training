package com.greenlearner.LibraryApplication.api;

import com.greenlearner.LibraryApplication.dto.Book;


public interface BookService  {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}