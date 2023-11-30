package org.kafka.entity;

public class Item {
    int id;
    String name;
    double price;
    int quantity;

    public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
