package com.kodilla.stream.immutable;
//Zadanie 7.2
public final class ForumUser {
    private  final String userName;
    private final String realName;

    public ForumUser(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
