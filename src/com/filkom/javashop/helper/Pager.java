package helper;

public class Pager {
    private int pageWidth = 25;
    private char horizontalBar = '=';
    private char verticalBar = '|';
    private char edge = '+';

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

    private void horizontalSeparator() {
        System.out.print(this.edge);
        for (int i = 0; i < this.pageWidth; i++) {
            System.out.print(horizontalBar);
        }
        System.out.print(this.edge);
        System.out.println();
    }

    private void spacer(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(verticalBar);
            for (int j = 0; j < pageWidth; j++) {
                System.out.print(" ");
            }
            System.out.print(verticalBar);
            System.out.println();
        }
    }

    public void messageCenter(String message) {
        horizontalSeparator();
        spacer(1);
        int size = pageWidth - 2;
        System.out.print(this.verticalBar);
        for (int i = 1; i < size / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(message);
        size -= message.length();
        for (int i = -1; i < size / 2; i++) {
            System.out.print(" ");
        }
        if (pageWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print(this.verticalBar);
        System.out.println();
        spacer(1);
        horizontalSeparator();
    }
}
