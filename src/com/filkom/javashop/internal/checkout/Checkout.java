
package com.filkom.javashop.internal.checkout;

import com.filkom.javashop.helper.Pager;
import com.filkom.javashop.internal.item.Item;
import com.filkom.javashop.internal.checkout.Checkout;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Checkout {
    Pager pager = new Pager();

    private int[] getPaymentCode() {
        int[] paymentCode = new int[4];
        for (int i = 0; i < paymentCode.length; i++) {
            int temp = 0;
            while (temp < 100 || temp == 1000) {
                temp = (int) (Math.random() * 1000);
            }
            paymentCode[i] = temp;
        }
        return paymentCode;
    }

    public int[] checkout(List<Item> products) {
        HashMap<String, Integer> finalProduct = new HashMap<>();
        int total = 0;
        pager.header("Checkout");
        pager.spacer();
        for (Item item : products) {
            finalProduct.merge(item.getName().toLowerCase(), item.getCount(), Integer::sum);
        }
        for (String i : finalProduct.keySet()) {
            pager.message("Item", 1);
            pager.message(i, 1);
            pager.spacer();
            pager.message("Count: " + String.valueOf(finalProduct.get(i)), 1);
            pager.spacer();
            total += finalProduct.get(i);
        }
        pager.message("Item count: " + finalProduct.size(), 1);
        pager.message("Item total: " + total, 1);
        pager.spacer();
        return getPaymentCode();
    }
}
