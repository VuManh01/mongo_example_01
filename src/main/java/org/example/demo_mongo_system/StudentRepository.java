package org.example.demo_mongo_system;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface    StudentRepository extends MongoRepository<Student,String> {
    @Override
    List<Student> findAll();
}
