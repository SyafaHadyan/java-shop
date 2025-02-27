package com.filkom.javashop.internal.item;

public class Item {
    private String name;
    private int count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
