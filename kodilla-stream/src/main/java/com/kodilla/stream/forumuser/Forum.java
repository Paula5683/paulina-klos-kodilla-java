package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(1234,"Nathan Drake", 'M', 1994,10,13,
                34));
        theUsersList.add(new ForumUser(1222, "Agatha Christie", 'F', 1993, 9,7,
                10));
        theUsersList.add(new ForumUser(1111, "Tony Stark", 'M', 2006, 4,20,
                15));
        theUsersList.add(new ForumUser(1233, "Hugh Jackman", 'M', 1990, 8,19,
                0));
        theUsersList.add(new ForumUser(1334, "Abelard Giza", 'M', 1989, 4,4,
                3));
        theUsersList.add(new ForumUser(1444, "Donna Beneviento", 'F', 2000, 5,16,
                2));
        theUsersList.add(new ForumUser(1432, "James Watson", 'M', 1983, 1,11,
                0));
        theUsersList.add(new ForumUser(1211, "Richard Feynman", 'M', 1999, 12,21,
                21));
        theUsersList.add(new ForumUser(1333, "Harry Potter", 'M', 2012, 6,30,
                13));
        theUsersList.add(new ForumUser(1023, "Robin Williams", 'M', 1991, 3,9,
                9));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUsersList);
    }
}
