package com.cocayan.crud.services.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cocayan.crud.entities.Contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactForm {

    private Long contactId;

    @NotNull
    @NotEmpty
    private String phoneNumber;

    private Long userId;

    public ContactForm() { }

    public ContactForm(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact contactFormToContact(ContactForm contactForm) {
        return new Contact(contactForm.getPhoneNumber());
    }
}
