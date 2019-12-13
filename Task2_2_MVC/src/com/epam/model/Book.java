package com.epam.model;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;

    public Book(String title, String author, String publisher, int year, int pages, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book (" + title + "; Author: " + author + "; Publisher: " + publisher +
                "; Year: " + year + "; Pages: " +
                pages + "; Price: " + price + "$)\n";
    }


}
