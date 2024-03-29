package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(final int userID, final String userName,final char sex,final int year, final int month,
                     final int day,final int postsQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID= " + userID +
                ", userName= " + userName +
                ", sex= " + sex +
                ", dateOfBirth= " + dateOfBirth +
                ", postQuantity= " + postsQuantity +
                '}';
    }
}
