package com.epam.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class BookModelTest {

    private BookModel model;

    @Parameterized.Parameter
    public Book[] parameter;

    @Parameterized.Parameter(1)
    public Book[] expected;

    @Parameterized.Parameter(2)
    public Book[] expected1;

    @Parameterized.Parameter(3)
    public Book[] expected2;

    @Parameterized.Parameter(4)
    public Book[] expected3;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Book[] books1 = new Book[]{new Book("title1", "author1", "publisher1", 1999, 234, 15),
                new Book("title2", "author1", "publisher1", 1965, 234, 15),
                new Book("title3", "author2", "publisher1", 1976, 234, 15),
                new Book("title4", "author3", "publisher1", 1989, 234, 15),
                new Book("title5", "author3", "publisher2", 2000, 234, 15)};

        Book[] books2 = new Book[]{new Book("title1", "author1", "publisher1", 1999, 234, 15),
                new Book("title2", "author1", "publisher1", 1965, 234, 15)};

        Book[] books3 = new Book[]{new Book("title1", "author1", "publisher1", 1999, 234, 15),
                new Book("title2", "author1", "publisher1", 1965, 234, 15),
                new Book("title3", "author2", "publisher1", 1976, 234, 15),
                new Book("title4", "author3", "publisher1", 1989, 234, 15)};

        Book[] books4 = new Book[]{new Book("title1", "author1", "publisher1", 1999, 234, 15),
                new Book("title5", "author3", "publisher2", 2000, 234, 15)};

        return Arrays.asList(new Object[][]{
                {books1, books1, books2, books3, books4},
        });
    }

    @Before
    public void setUp(){
        model = new BookModel();
    }

    @Test
    public void getBooks() {
        assertArrayEquals(expected,model.getBooks());
    }

    @Test
    public void getBooksByAuthor() {
        assertArrayEquals(expected1,model.getBooksByAuthor());
    }

    @Test
    public void getBooksByPublisher() {
        assertArrayEquals(expected2,model.getBooksByPublisher());
    }

    @Test
    public void getBooksByYear() {
        assertArrayEquals(expected3,model.getBooksByYear(1998));
    }
}