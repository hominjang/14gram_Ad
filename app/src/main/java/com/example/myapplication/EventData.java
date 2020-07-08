package com.example.myapplication;

public class EventData {
    private String EventProduct;
    private int price1;
    private int price2;

    public EventData (String EventProduct, int price1, int price2){
        this.EventProduct = EventProduct;
        this.price1 = price1;
        this.price2 = price2;
    }

    public int getPrice1() {
        return this.price1;
    }

    public int getPrice2() {
        return this.price2;
    }

    public String getEventProduct() {
        return this.EventProduct;
    }
}
