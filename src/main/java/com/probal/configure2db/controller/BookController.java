package com.probal.configure2db.controller;

import com.probal.configure2db.model.book.Book;
import com.probal.configure2db.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/add_books")
    public List<Book> addBooks() {
        List<Book> bookList = Arrays.asList(
                new Book(21, "C++ book"),
                new Book(22, "Java Book"),
                new Book(23, "Design Patterns")
        );

        return bookService.addBooks(bookList);
    }
}
