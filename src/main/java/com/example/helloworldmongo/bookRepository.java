package com.example.helloworldmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepository extends MongoRepository<Book,Integer>{
}
