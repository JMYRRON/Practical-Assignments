package Controller;

import Model.Book;

import java.util.Arrays;

public class Menu {

    private Book[] books;

    public Menu(Book[] books) {
        this.books = books;
    }

    public void getBooksByAuthor (String author) {
        int authorBooksNumber = 0;
        for (Book book:books) {
            if (book.getAuthor().equals(author)) {
                authorBooksNumber++;
            }
        }
        Book[] authorbooks = new Book[authorBooksNumber];
        int index = 0;
        for (Book book:books) {
            if (book.getAuthor().equals(author)) {
                authorbooks[index] = book;
                index++;
            }
        }

        printBooks(authorbooks);

    }

    public void getByPublisher (String publisher) {

        int publisherBooksNumber = 0;
        for (Book book:books) {
            if (book.getPublisher().equals(publisher)) {
                publisherBooksNumber++;
            }
        }
        Book[] publisherbooks = new Book[publisherBooksNumber];
        int index = 0;
        for (Book book:books) {
            if (book.getPublisher().equals(publisher)) {
                publisherbooks[index] = book;
                index++;
            }
        }

        printBooks(publisherbooks);
    }

    public void getBooksByYear (int year) {

        int yearBooksNumber = 0;
        for (Book book:books) {
            if (book.getYear() == year) {
                yearBooksNumber++;
            }
        }
        Book[] yearbooks = new Book[yearBooksNumber];
        int index = 0;
        for (Book book:books) {
            if (book.getYear() == year) {
                yearbooks[index] = book;
                index++;
            }
        }

        printBooks(yearbooks);
    }

    public void sortByPublisher() {

        Arrays.sort(books, new Comparator());
        printBooks(books);

    }

    public void printNewBooks(Book[] books) {
        for (Book book:books) {
            System.out.println(book);
        }
    }

    private static void printBooks(Book[] books) {
        for (Book book:books) {
            System.out.println(book);
        }
    }

}
