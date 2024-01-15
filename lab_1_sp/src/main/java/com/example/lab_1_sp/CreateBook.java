package com.example.lab_1_sp;

import com.example.lab_1_sp.models.Book;
import com.example.lab_1_sp.services.BooksService;

public class CreateBook implements Command {
    private final BooksService booksService;
    private Book book;

    public CreateBook(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        booksService.addBook(book);
    }
}