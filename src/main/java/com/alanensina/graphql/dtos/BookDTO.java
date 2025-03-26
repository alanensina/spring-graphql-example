package com.alanensina.graphql.dtos;

import com.alanensina.graphql.model.Book;

import java.util.List;

public record BookDTO(
        Integer id,
        String name,
        Integer pageCount
) {

    public static List<BookDTO> from(List<Book> books){
        return books.stream().map(b -> new BookDTO(
                b.getId(), b.getName(), b.getPageCount()
        )).toList();
    }
}
