import Controller.*;
import Model.Book;

public class Main {
    public static void main (String[] args) {
        Generator generator = new Generator();
        Book[] books = generator.generateBooks(14);
        /*books[0] = new Book("title1","author1","publisher1",1999,200, 10);
        books[1] = new Book("title2","author2","publisher3",1945,320, 20);
        books[2] = new Book("title3","author3","publisher2",1965,126, 30);
        books[3] = new Book("title4","author1","publisher3",1976,400, 25);
        books[4] = new Book("title5","author1","publisher4",1998,541, 35);
        books[5] = new Book("title6","author2","publisher2",1975,278, 17);
        books[6] = new Book("title7","author2","publisher1",1951,199, 21);
        books[7] = new Book("title8","author3","publisher3",2001,501, 41);
        books[8] = new Book("title9","author1","publisher1",2002,312, 28);
        books[9] = new Book("title10","author1","publisher4",2005,144,15);*/

        Menu menu = new Menu(books);

        menu.printNewBooks(books);


        System.out.println("Books written by author1: ");
        menu.getBooksByAuthor("author1");

        System.out.println("Books published by publisher2: ");
        menu.getByPublisher("publisher2");

        System.out.println("Books published after 1951: ");
        menu.getBooksByYear(1951);

        System.out.println("Books sorted by publisher: ");
        menu.sortByPublisher();
    }
}
