package pl.pjait;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Product product = new Product();
        product.setCode("12344");
        product.setDiscountPrice(40.0);
        product.setPrice(50.00);
        product.setName("Cukier");

        Product product2 = new Product("232", "mleko", 10.0, 5.0);
        Product product3 = new Product("234", "kawa", 5.0, 2.0);
        Product product4 = new Product();

        String productInformation = product.getCode() + " " + product.getName() + " " + product.getPrice() + " " + product.getDiscountPrice();
        String productInformation2 = product2.getCode() + " " + product2.getName() + " " + product2.getPrice() + " " + product2.getDiscountPrice();

        System.out.println(productInformation);
        System.out.println(productInformation2);
        System.out.println(product3.toString());
        System.out.println(product4.toString());

        Product[] products = new Product[]{
                new Product("111", "woda", 2.0, 1.0),
                new Product("125", "piwo", 3.0, 2.0),
                product,
                product2,
                product3,
                product4
        };

        Cart cart = new Cart();
        cart.setProducts(products);

        System.out.println(cart.toString());
    }
}
