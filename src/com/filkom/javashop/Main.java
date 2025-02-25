import java.util.Scanner;
import helper.Pager;

public class Main {

    static Pager pager = new Pager();

    private static void welcomeMessage() {
        pager.horizontalSeparator();
        pager.spacer();
        pager.messageCenter("Welcome to javaShop");
        pager.messageCenter("Available products");
        pager.spacer();
        pager.horizontalSeparator();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        welcomeMessage();
        input.close();
    }
}
