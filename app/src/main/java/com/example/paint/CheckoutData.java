package com.example.paint;

public class CheckoutData {
    String title;
    String name;
    String qty;
    String size;
    String txt;
    Integer poster;

    public CheckoutData(Integer poster, String title, String name, String qty, String size, String txt) {


        this.title = title;
        this.name = name;
        this.qty = qty;
        this.size = size;
        this.txt = txt;
        this.poster = poster;

    }

}
