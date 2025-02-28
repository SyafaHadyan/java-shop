package com.filkom.javashop.internal.daftarbelanja;

import com.filkom.javashop.helper.Pager;
import java.util.ArrayList;
import java.util.List;

public class DaftarBelanja {
    Pager pager = new Pager();
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

    public void showItems(List<DaftarBelanja> products) {
        int total = 0;
        pager.header("Product List");
        pager.spacer();
        for (DaftarBelanja item : products) {
            pager.message("Item", 1);
            pager.message(item.getName(), 1);
            pager.spacer();
            pager.message("Count: " + String.valueOf(item.getCount()), 1);
            pager.spacer();
            total += item.getCount();
        }
        pager.message("Item count: " + products.size(), 1);
        pager.message("Item total: " + total, 1);
    }
}
