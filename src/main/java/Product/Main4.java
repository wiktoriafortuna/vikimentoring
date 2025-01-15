package Product;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args){
        Shop shop1= new Shop ("shop1");
        shop1.addProduct("apple");
        shop1.addProduct("OgOrek");
        shop1.addProduct("pineapple");

        Shop shop2=new Shop ("shop2");
        shop2.addProduct("figa");
        shop2.addProduct("fasola");

        boolean isProductAvailable= shop1.isAvailable("Apple");
        boolean isProductAvailable1= shop2.isAvailable("Figa");
        System.out.println(isProductAvailable);
        System.out.println (isProductAvailable1);


//        Product product1=new Product("ogorek");
//        Product product2=new Product("pomidor");
//        List<Product> products= new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        System.out.println(product1);
//        System.out.println(product2);
//        Shop shop = new Shop(products);
//        boolean isOgorekAvailable= shop.isAvailable("ogorek");
//        System.out.println(isOgorekAvailable);





    }
}
