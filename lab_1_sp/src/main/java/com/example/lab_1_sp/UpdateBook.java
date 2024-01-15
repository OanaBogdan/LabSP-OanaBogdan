package com.example.lab_1_sp;

import com.example.lab_1_sp.models.Book;
import com.example.lab_1_sp.services.BooksService;

public class UpdateBook implements Command{
    private final BooksService booksService;
    private int bookId;
    private Book updatedBook;

    public UpdateBook(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setUpdatedBook(Book updatedBook) {
        this.updatedBook = updatedBook;
    }

    @Override
    public void execute() {
        booksService.updateBook(updatedBook);
    }
}