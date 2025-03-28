package com.alanensina.graphql.repositories;

import com.alanensina.graphql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
