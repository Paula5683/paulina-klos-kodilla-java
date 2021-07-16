package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Book book1 = new Book("Harry Potter", "J.K.Rowling", LocalDate.of(2011,12,11));
        Book book2 = new Book("The Lord of the Rings", "J.R.R.Tolkien", LocalDate.of(2001,2,1));
        Book book3 = new Book("The name of the rose", "Umberto Eco", LocalDate.of(2009,1,24));
        Book book4 = new Book("Faust", "Goethe", LocalDate.of(1998,4,9));
        Book book5 = new Book("Rosemary's baby", "Ira Levin", LocalDate.of(2003,5,15));
        Book book6 = new Book("Psycho", "Robert Bloch", LocalDate.of(2013,3,13));

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        assertEquals(5, library.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
