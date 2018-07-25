package com.fpt.repository;
/**
 * 
 * @author DUCHT4
 * @date Jul 12, 2018
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fpt.entity.File;

@Repository
public interface FileRepository extends MongoRepository<File, Integer> {

}
