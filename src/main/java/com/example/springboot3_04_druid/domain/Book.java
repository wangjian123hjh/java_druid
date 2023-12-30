package com.example.springboot3_04_druid.domain;

import lombok.Data;

@Data
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;
    private String test;
}
