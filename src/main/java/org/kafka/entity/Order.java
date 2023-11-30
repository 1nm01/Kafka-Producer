package org.kafka.entity;

import java.util.List;

public class Order {
    int id;
    List<Item> items;

    public Order(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }
}
