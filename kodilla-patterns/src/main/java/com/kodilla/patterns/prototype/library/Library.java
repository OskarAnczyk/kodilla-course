package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    private String name2;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name2 = name;
    }

    public String getName() {
        return name2;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<Book>();
        for(Book book : books){
            Book clonedBook = new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
}
