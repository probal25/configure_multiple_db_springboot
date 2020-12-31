package com.probal.configure2db.service.book;

import com.probal.configure2db.model.book.Book;
import com.probal.configure2db.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> addBooks(List<Book> bookList) {
        return bookRepository.saveAll(bookList);
    }
}
