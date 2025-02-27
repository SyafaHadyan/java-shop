package com.filkom.javashop.helper;

public class Pager {
    private int pageWidth = 25;
    private char horizontalBar = '=';
    private char verticalBar = '|';
    private char edge = '+';

    private void printSpace() {
        System.out.print(verticalBar);
        for (int i = 0; i < pageWidth; i++) {
            System.out.print(" ");
        }
        System.out.print(verticalBar);
        newLine();
    }

    private void newLine() {
        System.out.println();
    }

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public void setHorizontalBar(char bar) {
        this.horizontalBar = bar;
    }

    public void setVerticalBar(char bar) {
        this.verticalBar = bar;
    }

    public void setEdge(char edge) {
        this.edge = edge;
    }

    public void horizontalSeparator() {
        System.out.print(this.edge);
        for (int i = 0; i < this.pageWidth; i++) {
            System.out.print(horizontalBar);
        }
        System.out.print(this.edge);
        newLine();
    }

    public void spacer() {
        printSpace();
    }

    public void spacer(int space) {
        for (int i = 0; i < space; i++) {
            printSpace();
        }
    }

    public void messageCenter(String message) {
        int size = this.pageWidth - message.length();
        System.out.print(this.verticalBar);
        for (int i = 0; i < size / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < size / 2; i++) {
            System.out.print(" ");
        }
        if (message.length() % 2 == 0) {
            System.out.print(" ");
        }
        System.out.print(this.verticalBar);
        newLine();
    }
}
