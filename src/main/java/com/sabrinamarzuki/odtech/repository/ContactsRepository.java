package com.sabrinamarzuki.odtech.repository;

import com.sabrinamarzuki.odtech.model.User.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepository extends MongoRepository<Contact, String> {

    List<Contact> findByTypeAndValue(String type, String value);
}
