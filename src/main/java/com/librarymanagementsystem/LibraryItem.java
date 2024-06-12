package com.librarymanagementsystem;

class LibraryItem {
    private String title;
    private String author;
    private String genre;
    private long isbn;
    private String publisher;
    private String publicationDate;

    public LibraryItem(String title, String author, String genre, long isbn, String publisher, String publicationDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void displayLibraryItem() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication date: " + publicationDate);
    }
}