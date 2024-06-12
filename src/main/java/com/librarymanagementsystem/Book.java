package com.librarymanagementsystem;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, String genre, long isbn, String publisher, String publicationDate, int numberOfPages) {
        super(title, author, genre, isbn, publisher, publicationDate);  // Calling the superclass constructor
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public void displayLibraryItem() {
        super.displayLibraryItem();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}