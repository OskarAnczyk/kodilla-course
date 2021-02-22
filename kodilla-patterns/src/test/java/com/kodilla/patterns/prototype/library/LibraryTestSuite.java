package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Biblioteka");
        Book book1 = new Book("Book1","Author1", LocalDate.now().minusDays(10));
        Book book2 = new Book("Book2","Author2", LocalDate.now().minusDays(15));
        Book book3 = new Book("Book3","Author3", LocalDate.now().minusDays(20));
        Book book4 = new Book("Book4","Author4", LocalDate.now().minusDays(25));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        Library library1 = null;
        Library library2 = null;
        //When
        try{
            library1 = library.shallowCopy();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        try{
           library2 = library.deepCopy();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        System.out.println(library2.getBooks().size());
        library.getBooks().add(book4);
        //Then
        assertEquals(library.getBooks().size(),library1.getBooks().size());
        assertFalse(library.getBooks().size() == library2.getBooks().size());

        for (Book book : library.getBooks()) {
            book.setAuthor("kafjsagfuysgafbyasf");
        }
        System.out.println(library.getBooks());
        System.out.println(library2.getBooks());
    }
}
