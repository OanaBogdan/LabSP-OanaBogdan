package com.example.lab_1_sp;

import com.example.lab_1_sp.services.BooksService;

public class GetAllBooks implements Command{
    private final BooksService booksService;

    public GetAllBooks(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public void execute() {
        booksService.getAllBooks();
}
}