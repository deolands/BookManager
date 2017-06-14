package com.mrak.bookmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "BOOK_TITLE")
    private String bookTitlel;

    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;

    @Column(name = "BOOK_PRICE")
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitlel() {
        return bookTitlel;
    }

    public void setBookTitlel(String bookTitlel) {
        this.bookTitlel = bookTitlel;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitlel=" + bookTitlel +
                ", bookAuthor=" + bookAuthor +
                ", price=" + price +
                '}';
    }
}
