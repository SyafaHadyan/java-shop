package com.filkom.javashop.helper;

public class Pager {
    private int pageWidth = 25;
    private char horizontalBar = '=';
    private char verticalBar = '|';

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    private void horizontalSeparator() {
        for (int i = 0; i < this.pageWidth; i++) {
            System.out.print(horizontalBar);
        }
        System.out.println();
    }

    public void messageCenter(String message) {
        int half = this.pageWidth / 2;
        for (int i = 0; i < half; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < half; i++) {
            System.out.print(" ");
        }
    }
}
