package org.example.Pertemuan4;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class LibraryHelperTest {

    @Test
    void testCountBooks() {
        LibraryService service = Mockito.mock(LibraryService.class);
        LibraryHelper helper = new LibraryHelper(service);

        List<Book>books = new ArrayList<>();
        books.add(new Book(1, "hai", "Abu Bakar"));
        books.add(new Book(2, "halo", "Ali"));

        Mockito.when(service.getAllBooks()).thenReturn(books);

        assertEquals(2, helper.countBooks());
    }

    @Test
    void testSaveBooksNotEmpty(){
        LibraryService service = Mockito.mock(LibraryService.class);
        LibraryHelper helper = new LibraryHelper(service);

        List<Book>books = new ArrayList<>();
        books.add(new Book(1, "hai", "Abu Bakar"));
        books.add(new Book(2, "halo", "Ali"));

        Mockito.when(service.getAllBooks()).thenReturn(books);

        helper.saveBooks(books);

//        Mockito.verify(service, Mockito.atLeastOnce()).storeBooks(books);
        Mockito.verify(service).storeBooks(books);
    }

    @Test
    void testSaveEmptyBooks() {
        List<Book> books = new ArrayList<>();

        LibraryService service = Mockito.mock(LibraryService.class);
        LibraryHelper helper = new LibraryHelper(service);

        helper.saveBooks(books);

        Mockito.verify(service, Mockito.never()).storeBooks(any());
    }
}