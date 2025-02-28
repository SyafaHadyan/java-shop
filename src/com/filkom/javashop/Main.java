package com.filkom.javashop;

import com.filkom.javashop.helper.Pager;
import com.filkom.javashop.internal.item.Item;
import com.filkom.javashop.internal.checkout.Checkout;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Pager pager = new Pager();
    static Item item = new Item();
    static Checkout checkout = new Checkout();
    static List<Item> products = new ArrayList<>();
    static final String SHOP_NAME = "javaShop";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (true) {
            Item current = new Item();
            pager.header("Welcome to " + SHOP_NAME);
            pager.spacer(2);
            pager.message("1. Add product", 2);
            pager.message("2. Check item", 2);
            pager.message("3. Checkout", 2);
            pager.message("4. Quit", 2);
            pager.spacer();
            String tempInput = pager.input(2);
            pager.footer();
            if (tempInput.equals("1")) {
                pager.header("Add product");
                pager.spacer();
                current.setName(pager.customInput("Name:", 2));
                while (true) {
                    try {
                        current.setCount(Integer.parseInt(pager.customInput("Count:", 2)));
                        break;
                    } catch (NumberFormatException e) {
                        //
                    }
                }
                products.add(current);
            } else if (tempInput.equals("2")) {
                item.showItems(products);
            } else if (tempInput.equals("3")) {
                int[] paymentCode = checkout.checkout(products);
                pager.message("Payment Code:", 1);
                pager.message(
                        String.valueOf(
                                paymentCode[0] + " " + paymentCode[1] + " " + paymentCode[2] + " " + paymentCode[3]),
                        1);
                products.clear();
            } else if (tempInput.equals("4")) {
                input.close();
                break;
            } else {
                pager.spacer();
                pager.message("Invalid input", 2);
            }
            pager.footer();
        }
    }
}
