package com.user.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Contact {

    private Long cId;
    private String emailId;
    private String contactName;
    private Long userId;

    public Contact(Long cId, String emailId, String contactName, Long userId) {
        this.cId = cId;
        this.emailId = emailId;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }
}

