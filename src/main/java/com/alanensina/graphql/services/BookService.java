package com.alanensina.graphql.services;

import com.alanensina.graphql.dtos.BookDTO;
import com.alanensina.graphql.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDTO> listAll(){
        var books = bookRepository.findAll();


        return null;
    }
}
