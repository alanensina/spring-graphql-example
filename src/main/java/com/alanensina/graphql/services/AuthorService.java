package com.alanensina.graphql.services;

import com.alanensina.graphql.model.Author;
import com.alanensina.graphql.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthorById(Integer id){
        var author = authorRepository.findById(id);

        if(author.isEmpty()){
            throw new IllegalArgumentException("Author not found. ID: " + id);
        }

        return author.get();
    }

    public List<Author> listAll() {
        return authorRepository.findAll();
    }
}
