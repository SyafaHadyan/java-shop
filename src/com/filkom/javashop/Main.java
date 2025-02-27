package com.filkom.javashop;

import com.filkom.javashop.helper.Pager;
import com.filkom.javashop.internal.item.Item;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Pager pager = new Pager();
    static List<Item> products = new ArrayList<>();
    static final String HEADER = "javaShop";

    private static void welcomeMessage() {
        pager.horizontalSeparator();
        pager.spacer();
        pager.messageCenter("Welcome to javaShop");
        pager.spacer();
        pager.horizontalSeparator();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (true) {
            welcomeMessage();
            pager.spacer(2);
            pager.message("1. Add product", 2);
            pager.message("2. Check item", 2);
            pager.message("3. Check out", 2);
            pager.spacer();
            String tempInput = pager.input(2);
            if (tempInput.equals("1")) {
                //
            } else if (tempInput.equals("2")) {
                //
            } else if (tempInput.equals("3")) {
                break;
            } else {
                pager.spacer();
                pager.message("Invalid input", 2);
            }
            pager.spacer();
            pager.horizontalSeparator();
            pager.emptySpace();
        }
        input.close();
    }
}
