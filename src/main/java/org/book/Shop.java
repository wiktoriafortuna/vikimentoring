package org.book;

import java.util.List;

public class Shop {
    public List<Product> products;
    public Shop(List<Product> products) {
        this.products = products;
    }
    public String isAvailable(String productName){
        return "dostepne";
    }

}
