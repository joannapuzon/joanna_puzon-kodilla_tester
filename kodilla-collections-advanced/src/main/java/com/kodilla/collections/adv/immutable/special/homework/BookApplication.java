package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("Twiligh", "John");
        Book book1 = BookManager.createBook("Circle", "Ben");
        Book book2 = BookManager.createBook("Triangle", "Anna");
        Book book3 = BookManager.createBook("Twiligh", "John");
        System.out.println(BookManager.bookList.size());

        for (Book book4 : BookManager.bookList){
            System.out.println(book4.getTitle()+" "+book4.getAuthor());
        }

    }
}
