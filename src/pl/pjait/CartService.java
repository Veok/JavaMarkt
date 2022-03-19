package pl.pjait;

import java.util.Arrays;

public class CartService {

    public Product getCheapestOne(Product[] products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(999999);
        for (Product product : products) {
            if (product.getPrice() <= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    public Product getExpensiveOne(Product[] products) {
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(0);
        for (Product product : products) {
            if (product.getPrice() >= temporaryProduct.getPrice()) {
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }

    //    public Product[] sortProductsByName(Product[] products) {
//
//    }
//
//    public Product[] sortProductsByPrice(Product[] products) {
//
//    }
//
    public double getSumOfCart(Cart cart) {
        double totalPrice = 0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
