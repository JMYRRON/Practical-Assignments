package com.epam.model;

import java.util.Random;

public class Generator {

    private static String[] authors = {"author1","author2","author3","author4"};
    private static String[] publishers = {"publisher1","publisher2","publisher3","publisher4","publisher5"};


    public static Book[] generateBooks(int number) {

        Book[] books = new Book[number];

        for (int i=0; i<number; i++) {
            int num = i + 1;
            String title = "title" + num;
            String author = authors[randomIndex(authors.length)];
            String publisher = publishers[randomIndex(publishers.length)];
            int year = randomNumber(60) + 1949;
            int pages = randomNumber(300) + 100;
            int price = randomNumber(30) + 10;
            books[i] = new Book(title,author,publisher,year,pages,price);
        }

        return books;

    }


    public String[] getAuthors() {
        return authors;
    }

    public String[] getPublishers() {
        return publishers;
    }

    private static int randomIndex(int len) {
        int i = new Random().nextInt(len);
        return i;
    }

    private static int randomNumber(int len) {
        int i = new Random().nextInt(len);
        return i;
    }


}
