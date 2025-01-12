package Product;

public class Product {
    public String name;

    Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
