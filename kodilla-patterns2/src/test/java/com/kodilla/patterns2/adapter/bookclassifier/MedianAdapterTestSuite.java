package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "23865"));
        bookSet.add(new Book("Author2", "Title2", 2001, "09786"));
        bookSet.add(new Book("Author3", "Title3", 1997, "45637"));
        bookSet.add(new Book("Author4", "Title4", 1999, "19875"));
        bookSet.add(new Book("Author5", "Title5", 2006, "20943"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2000, median);




    }
}
