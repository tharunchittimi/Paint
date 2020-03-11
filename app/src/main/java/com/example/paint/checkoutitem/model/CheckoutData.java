package com.example.paint.checkoutitem.model;

public class CheckoutData {
   public String title;
   public String name;
   public String qty;
   public String size;
   public String txt;
   public Integer poster;

    public CheckoutData(Integer poster, String title, String name, String qty, String size, String txt) {


        this.title = title;
        this.name = name;
        this.qty = qty;
        this.size = size;
        this.txt = txt;
        this.poster = poster;

    }

}
