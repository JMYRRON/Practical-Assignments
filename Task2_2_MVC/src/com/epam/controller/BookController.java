package com.epam.controller;

import com.epam.model.Book;
import com.epam.model.BookModel;
import com.epam.view.BookView;
import com.epam.view.InputData;

public class BookController {

    private BookModel model = new BookModel();
    private BookView view = new BookView();

    public void run() {
        view.viewData(ConverterInString.convertArrayBooks(model.getBooks()));
        view.viewData("--------------------------------------------------------------");
        view.viewData(model.checkAuthorValidity());
        view.viewData("--------------------------------------------------------------");
        view.viewData(model.checkPublisherValidity());
        view.viewData("--------------------------------------------------------------");
        view.viewData(ConverterInString.convertArrayBooks(model.getBooksByYear(1965)));
        view.viewData("--------------------------------------------------------------");
        view.viewData(ConverterInString.convertArrayBooks(model.getSortByPublisher()));
    }
}
