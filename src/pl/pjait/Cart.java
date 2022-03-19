package pl.pjait;

import java.util.Arrays;

public class Cart {

    private Product[] products;

    public Cart() {
    }

    public Cart(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
