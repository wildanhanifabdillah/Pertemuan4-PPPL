package org.example.Pertemuan4;

import java.util.List;

public class LibraryHelper {
    private LibraryService service;
    public LibraryHelper(LibraryService service){
           this.service = service;
    }
    public int countBooks(){
        List <Book> books = this.service.getAllBooks();

        return books.size();
    }

    public void saveBooks(List <Book> books) {
        if (books.size() > 0) {
            this.service.storeBooks(books);
        }
    }
}
