package com.alanensina.graphql.controllers;

import com.alanensina.graphql.model.Author;
import com.alanensina.graphql.services.AuthorService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @QueryMapping
    public List<Author> authors(){
        return authorService.listAll();
    }
}
