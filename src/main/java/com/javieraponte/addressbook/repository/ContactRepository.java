package com.javieraponte.addressbook.repository;

import com.javieraponte.addressbook.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}