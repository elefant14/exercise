package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private LibraryDatabase libraryDatabaseMock;
    private BookLibrary bookLibrary;

    @Before
    public void beforeEachTest(){
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    @Test
    public void testListBooksWithConditionsReturnList() {

        // Given
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfZeroBooks(){
        //Given
        List<Book>listOfZeroBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfZeroBooks);
        //When
        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));
        //Then
        assertEquals(0, resultListBooksInHandsOf.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testListBooksInHandsOfOneBook(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfOneBook = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        listOfOneBook.add(book1);

        LibraryUser libraryUser1= new LibraryUser("X","Y","0");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(listOfOneBook);

        //When
        List<Book> theListOfOneBook = bookLibrary.listBooksInHandsOf(libraryUser1);

        //Then
        assertEquals(1,theListOfOneBook.size());

    }

    @Test
    public void testListBooksInHandsOfFiveBook(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfFiveBook = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book5 = new Book("East of Eden", "John Steinbeck", 2000);
        listOfFiveBook.add(book1);
        listOfFiveBook.add(book2);
        listOfFiveBook.add(book3);
        listOfFiveBook.add(book4);
        listOfFiveBook.add(book5);

        LibraryUser libraryUser1 = new LibraryUser("X", "Y", "0");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(listOfFiveBook);

        //When
        List<Book> theListOfFiveBook = bookLibrary.listBooksInHandsOf(libraryUser1);

        //Then
        assertEquals(5, theListOfFiveBook.size());
    }
}