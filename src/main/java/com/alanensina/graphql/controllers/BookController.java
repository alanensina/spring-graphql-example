package com.alanensina.graphql.controllers;

import com.alanensina.graphql.model.Author;
import com.alanensina.graphql.model.Book;
import com.alanensina.graphql.services.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping
    public List<Book> books(){
        return bookService.listAll();
    }

    @QueryMapping
    public Book bookById(@Argument Integer id){
        return bookService.getBookById(id);
    }

    @SchemaMapping
    public Author author(Book book){
        return bookService.getAuthorById(book.getAuthor().getId());
    }
}
