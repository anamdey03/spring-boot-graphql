package com.spring.graphql.api.service.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.graphql.api.model.Book;
import com.spring.graphql.api.repository.BookRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book>{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book get(DataFetchingEnvironment environment) {
		String isn = environment.getArgument("id"); 
		return bookRepository.findById(isn).get();
	}

}
