package com.resendegabriel.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resendegabriel.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}