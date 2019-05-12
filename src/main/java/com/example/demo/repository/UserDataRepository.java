package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.UserData;

public interface UserDataRepository extends MongoRepository<UserData, Integer> {

}

