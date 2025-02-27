package com.filkom.javashop.internal.item;

public class Item {
    public String name;
    public int count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int stock) {
        this.count = stock;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
