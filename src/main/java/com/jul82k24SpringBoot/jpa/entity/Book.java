package com.jul82k24SpringBoot.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
//@Getter
//@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false,unique = true)
    private String name;

    @Column(name = "author",length = 20)
    private String author;

    private Double price=0.0;

    private Integer pages=0;

    private LocalDate publishDate=LocalDate.now();


//    public Book() {
//    }
//
//    public Book(int id, String name, String author, Double price, Integer pages, LocalDate publishDate) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.pages = pages;
//        this.publishDate = publishDate;
//    }
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                ", pages=" + pages +
//                ", publishDate=" + publishDate +
//                '}';
//    }
}
