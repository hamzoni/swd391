package com.fpt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fpt.entity.Users;

/**
 * 
 * @author TungLT25
 * @date Jul 12, 2018
 */
@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {

}
