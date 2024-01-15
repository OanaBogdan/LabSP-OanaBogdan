package com.example.lab_1_sp;

import com.example.lab_1_sp.services.BooksService;

public class DeleteBook implements Command{
    private final BooksService booksService;

    private String bookName;

    public DeleteBook(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void execute() {
        booksService.deleteBook(booksService.getBookByName(bookName));
}
}