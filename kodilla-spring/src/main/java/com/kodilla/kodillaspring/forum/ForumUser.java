package com.kodilla.kodillaspring.forum;

import org.springframework.stereotype.Component;

@Component
public final class ForumUser {

    String username;

    public ForumUser() {
        this.username = "John Smith";
    }
}
