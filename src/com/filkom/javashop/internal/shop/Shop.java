package internal.shop;

import java.util.List;
import java.util.ArrayList;

public class Shop {

    private List<List<String>> products = new ArrayList<>();

    public List<List<String>> getAllProduct() {
        return this.products;
    }
}
