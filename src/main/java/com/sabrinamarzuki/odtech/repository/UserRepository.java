package com.sabrinamarzuki.odtech.repository;

import com.sabrinamarzuki.odtech.model.User.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Customer, String> {

    @Query("{'identification.idType':?0, 'identification.idNumber':?1}")
    Customer findByIdentification(String idType, String idNumber);

}
