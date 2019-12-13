package com.epam.model;

import com.epam.controller.ConverterInString;
import com.epam.view.InputData;

import java.util.Arrays;

public class BookModel {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public BookModel() {
        books = Generator.generateBooks(10);
    }

    public Book[] getBooksByAuthor(String author) {
        int authorBooksNumber = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBooksNumber++;
            }
        }
        Book[] authorbooks = new Book[authorBooksNumber];
        int index = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorbooks[index] = book;
                index++;
            }
        }
        return authorbooks;
    }

    public Book[] getBooksByPublisher(String publisher) {
        int publisherBooksNumber = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                publisherBooksNumber++;
            }
        }
        Book[] publisherbooks = new Book[publisherBooksNumber];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                publisherbooks[index] = book;
                index++;
            }
        }
        return publisherbooks;
    }

    public Book[] getBooksByYear(int year) {
        int yearBooksNumber = 0;
        for (Book book : books) {
            if (book.getYear()>year) {
                yearBooksNumber++;
            }
        }
        Book[] yearbooks = new Book[yearBooksNumber];
        int index = 0;
        for (Book book : books) {
            if (book.getYear()>year) {
                yearbooks[index] = book;
                index++;
            }
        }
        return yearbooks;
    }

    public Book[] getSortByPublisher() {

        Book[] sortedbooks = Arrays.copyOf(books,books.length);

        Arrays.sort(sortedbooks, new Comparator());

        return sortedbooks;
    }

    public String checkAuthorValidity () {
        System.out.println("Enter author ->");
        boolean v = false;
        String message = "";
        while (!v) {
            String author = InputData.input();
            if (author.equalsIgnoreCase("next")) {
                message = "";
                v = true;
            }
            for (Book book:books) {
                if (author.equalsIgnoreCase(book.getAuthor())) {
                    message = ConverterInString.convertArrayBooks(getBooksByAuthor(author));
                    v = true;
                }
            }
            if (!v) {
                System.out.println("We do not have books written by " + author + ". Enter NEXT to skip");
            }
            }
        return message;
    }

    public String checkPublisherValidity () {
        System.out.println("Enter publisher ->");
        boolean v = false;
        String message = "";
        while (!v) {
            String publisher = InputData.input();
            if (publisher.equalsIgnoreCase("next")) {
                message = "";
                v = true;
            }
            for (Book book:books) {
                if (publisher.equalsIgnoreCase(book.getPublisher())) {
                    message = ConverterInString.convertArrayBooks(getBooksByPublisher(publisher));
                    v = true;
                }
            }
            if (!v) {
                System.out.println("We do not have books published by " + publisher + ". Enter NEXT to skip");
            }
        }
        return message;
    }
}
