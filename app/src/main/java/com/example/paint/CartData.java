package com.example.paint;

public class CartData {

    String title;
    String name;
    String qty;
    String size;
    String txt;
    Integer poster;

    public CartData(Integer poster, String title, String name, String qty, String size, String txt) {

        this.title = title;
        this.name = name;
        this.qty = qty;
        this.size = size;
        this.txt = txt;
        this.poster = poster;
    }
}
