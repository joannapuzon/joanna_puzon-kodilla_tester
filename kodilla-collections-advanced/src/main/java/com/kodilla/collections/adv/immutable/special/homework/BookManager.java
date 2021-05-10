package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> bookList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
//        bookList.add(book);
        if (bookList.size() == 0) {
            bookList.add(book);
        }

        if (bookList.contains(book)) {
            System.out.println("Book already exist");

        } else {
            bookList.add(book);
        }
        return book;
    }
}