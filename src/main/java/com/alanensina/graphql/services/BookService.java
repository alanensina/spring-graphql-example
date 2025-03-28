package com.alanensina.graphql.services;

import com.alanensina.graphql.model.Author;
import com.alanensina.graphql.model.Book;
import com.alanensina.graphql.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public BookService(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    public List<Book> listAll(){
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        var opt = bookRepository.findById(id);
        Book book;

        if(opt.isEmpty()){
            throw new IllegalArgumentException("Book not found. id: " + id);
        }else{
            book = opt.get();
        }

        return book;
    }

    public Author getAuthorById(Integer id) {
        return authorService.getAuthorById(id);
    }
}
