package com.spring.graphql.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.graphql.api.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{

}
