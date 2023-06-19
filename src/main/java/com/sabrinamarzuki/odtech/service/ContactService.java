package com.sabrinamarzuki.odtech.service;

import com.sabrinamarzuki.odtech.model.User.Contact;
import com.sabrinamarzuki.odtech.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactsRepository contactsRepository;

    public Contact getContactById(String id) throws Exception{
        return Optional.of(contactsRepository.findById(id)).get().orElseThrow(() -> new Exception("No contact found"));
    }

}
