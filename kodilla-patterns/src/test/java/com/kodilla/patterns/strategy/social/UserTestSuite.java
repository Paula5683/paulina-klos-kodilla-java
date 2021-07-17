package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User ania = new YGeneration("Anna Shirley");
        User zuzia = new ZGeneration("Suzanne Collins");
        User dżesika = new Millenials("Jessica Rabbit");

        //When
        String aniaPost = ania.sharePost();
        System.out.println("Ania posts on: " + aniaPost);
        String zuziaPost = zuzia.sharePost();
        System.out.println("Zuzia posts on: " + zuziaPost);
        String dżesikaPost = dżesika.sharePost();
        System.out.println("Dżesika posts on: " + dżesikaPost);

        //Then
        assertEquals("Facebook", aniaPost);
        assertEquals("Twitter", zuziaPost);
        assertEquals("Snapchat", dżesikaPost);

    }
    @Test
    void testIndividualsSharingStrategies(){
        //Given
        User agatka = new ZGeneration("Agatha Christie");

        //When
        String agatkaPost = agatka.sharePost();
        System.out.println("Agatka posts on: " + agatkaPost);
        agatka.setSharingStrategy(new SnapchatPublisher());
        agatkaPost = agatka.sharePost();
        System.out.println("Agatka posts on: " + agatkaPost);

        //Then
        assertEquals("Snapchat", agatkaPost);

    }
}
