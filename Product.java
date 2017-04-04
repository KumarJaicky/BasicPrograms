import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{

private String id;
private String name;
private double price;
private int quantity;



public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price
                + ", quantity=" + quantity + '}';
    }

    public int compareTo(Product o) {
        int result = this.name.compareToIgnoreCase(o.name);
        if(result != 0){
            return result;
        }else{
            return new Double(this.price).compareTo(new Double(o.price));
        }

    }

    public static void main(String[] args) {
        Product p1 = new Product("p1", "shoes", 30.33, 20);
        Product p2 = new Product("p2", "shoes", 20.30, 20);
        Product p3 = new Product("p3", "shoes", 50.33, 20);
        Product p4 = new Product("p4", "socks", 10.50, 20);
        Product p5 = new Product("p5", "socks", 5.40, 20);
        Product p6 = new Product("p6", "socks", 2.34, 20);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);

        System.out.println("Unsorted");
        for(Product product:products){
            System.out.println("Product: " + product.getName() + " Price: " + product.getPrice());
        }

       Collections.sort(products);

        System.out.println("sorted");
        for(Product product:products){
            System.out.println("Product: " + product.getName() + " Price: " + product.getPrice());
        }
    }
}