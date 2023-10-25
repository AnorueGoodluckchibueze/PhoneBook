package org.example.Service;

import org.example.entities.Contact;

import java.util.List;

public interface PhoneService {
    Contact addContact(Contact contact);
    List<Contact> searchByName(String name);
    Contact searchByNumber(Long phoneNumber);
}
