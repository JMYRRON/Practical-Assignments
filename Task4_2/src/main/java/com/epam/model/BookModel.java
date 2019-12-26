package com.epam.model;

import com.epam.controller.ConverterInString;
import com.epam.view.InputData;


import java.util.Arrays;
import java.util.Comparator;

public class BookModel {

    private Book[] books;

    public BookModel() {
        books = new Book[]{new Book("title1", "author1", "publisher1", 1999, 234, 15),
                new Book("title2", "author1", "publisher1", 1965, 234, 15),
                new Book("title3", "author2", "publisher1", 1976, 234, 15),
                new Book("title4", "author3", "publisher1", 1989, 234, 15),
                new Book("title5", "author3", "publisher2", 2000, 234, 15)};;
    }

    public Book[] getBooks() {
        return books;
    }

    public Book[] getBooksByAuthor() {
        String author = "author1"/*checkAuthorValidity()*/;
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

    public Book[] getBooksByPublisher() {
        String publisher = "publisher1"/*checkPublisherValidity()*/;
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

        Arrays.sort(sortedbooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });

        return sortedbooks;
    }

    private String checkAuthorValidity () {
        System.out.println("Enter author ->");
        String author = "";
        boolean v = false;
        while (!v) {
            author = InputData.input();
            if (author.equalsIgnoreCase("next")) {
                v = true;
            }
            for (Book book:books) {
                if (author.equalsIgnoreCase(book.getAuthor())) {
                    v = true;
                }
            }
            if (!v) {
                System.out.println("We do not have books written by " + author + ". Enter NEXT to skip");
            }
            }
        return author;
    }

    private String checkPublisherValidity () {
        System.out.println("Enter publisher ->");
        String publisher = "";
        boolean v = false;
        while (!v) {
            publisher = InputData.input();
            if (publisher.equalsIgnoreCase("next")) {
                v = true;
            }
            for (Book book:books) {
                if (publisher.equalsIgnoreCase(book.getPublisher())) {
                    v = true;
                }
            }
            if (!v) {
                System.out.println("We do not have books published by " + publisher + ". Enter NEXT to skip");
            }
        }
        return publisher;
    }
}
