package com.sabrinamarzuki.odtech.repository;

import com.sabrinamarzuki.odtech.model.Order.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends MongoRepository<Transaction, String> {

}
