package Product;

import java.util.List;

public class Shop {
    public List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }
    public boolean isAvailable( String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return true;
            }
        }
        return false;

    }



}
