package Product;

import org.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> products;
    String name;

    public Shop(String name) {
        this.products = new ArrayList<>();
        this.name=name;
    }
    public boolean isAvailable( String productName) {
        for (Product product : products) {
            String name1= product.getName();
            if (name1.equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;

    }
    public void addProduct(String productName){
        Product product = new Product (productName);
        this.products.add(product);
    }



}
