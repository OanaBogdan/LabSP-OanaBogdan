package com.example.lab_1_sp;

import com.example.lab_1_sp.services.BooksService;

public class GetBookByName implements Command{
    private final BooksService booksService;
    private String bookName;

    public GetBookByName(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        booksService.getBookByName(bookName);
}
}