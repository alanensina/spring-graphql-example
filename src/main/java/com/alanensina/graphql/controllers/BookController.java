package com.alanensina.graphql.controllers;

import com.alanensina.graphql.dtos.BookDTO;
import com.alanensina.graphql.services.BookService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<BookDTO> books(){
        return bookService.listAll();
    }
}
