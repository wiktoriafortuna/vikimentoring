package Product;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args){
        Product product1=new Product("ogorek");
        Product product2=new Product("pomidor");
        List<Product> products= new ArrayList<>();
        products.add(product1);
        products.add(product2);
        System.out.println(product1);
        System.out.println(product2);
        Shop shop = new Shop(products);
        boolean isOgorekAvailable= shop.isAvailable("ogorek");
        System.out.println(isOgorekAvailable);





    }
}
