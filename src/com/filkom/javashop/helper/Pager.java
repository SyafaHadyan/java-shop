package com.filkom.javashop.helper;

public class Pager {
    private int pageWidth = 25;
    private char horizontalBar = '=';
    private char verticalBar = '|';
    private char edge = '+';

    private void printSpace() {
        beginLine();
        for (int i = 0; i < pageWidth; i++) {
            System.out.print(" ");
        }
        endLine();
    }

    private void beginLine() {
        System.out.print(this.verticalBar);
    }

    private void endLine() {
        System.out.println(this.verticalBar);
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
        System.out.println(this.edge);
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
        beginLine();
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
        endLine();
    }

    public void message(String message, int spaceBefore) {
        for (int i = 0; i < spaceBefore; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int i = 0; i < pageWidth - 2 - spaceBefore; i++) {
            System.out.print(" ");
        }
        System.out.print(this.horizontalBar);
        endLine();
    }
}
