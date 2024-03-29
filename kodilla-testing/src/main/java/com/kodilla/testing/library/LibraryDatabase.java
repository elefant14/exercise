package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    // lists books having title beginning with titleFragment
    public abstract List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    public abstract List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    public abstract boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back
    public abstract int returnBooks(LibraryUser libraryUser);


}
