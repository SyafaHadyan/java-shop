package com.filkom.javashop.helper;

public class Pager {
    private int pageWidth = 25;
    private char horizontalBar = '=';
    private char verticalBar = '|';

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public void setHorizontalBar(char bar) {
        this.horizontalBar = bar;
    }

    public void setVerticalBar(char bar) {
        this.verticalBar = bar;
    }

    private void horizontalSeparator() {
        for (int i = 0; i < this.pageWidth; i++) {
            System.out.print(horizontalBar);
        }
        System.out.println();
    }

    public void messageCenter(String message) {
        int half = this.pageWidth / 2;
        System.out.print(this.verticalBar);
        for (int i = 0; i < half; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < half; i++) {
            System.out.print(" ");
        }
        System.out.print(this.verticalBar);
        System.out.println();
    }
}
