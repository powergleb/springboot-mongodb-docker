package com.powergleb.docker.compose.dao;

import com.powergleb.docker.compose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {

}