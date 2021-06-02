package com.kodilla.collections.adv.immutable;

public final class Book {

    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}