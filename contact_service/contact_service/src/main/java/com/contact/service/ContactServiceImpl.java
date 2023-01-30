package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contact of user
    List<Contact> list = List.of(
            new Contact(123l,"ujjawal2503@gmail.com","Ujjawal",1223l),
            new Contact(124l,"Aseem2503@gmail.com","Aseem",1212l),
            new Contact(125l,"Kamal2503@gmail.com","kamal",1225l),
            new Contact(126l,"anil2503@gmail.com","Ujjawal",1223l)

    );

    @Override
    public List<Contact> getListOfContact(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
