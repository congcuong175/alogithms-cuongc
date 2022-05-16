import Entity.Product;

public class Bai16maxByPrice {
    public Product maxByPrice(Product[] products) {
        int max = products[0].getPrice();
        for (Product pr : products) {
            if (pr.getPrice() > max) {
                max = pr.getPrice();
            }
        }
        for (Product pr : products
        ) {
            if (pr.getPrice() == max) {
                return pr;
            }
        }
        return null;
    }
}
