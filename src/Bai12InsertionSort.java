import Entity.Product;

public class Bai12InsertionSort {
    public Product[] sortByName(Product[] products) {
        int n = products.length;
        for (int j = 1; j < n; j++) {
            Product key = products[j];
            int i = j - 1;
            while ((i > -1) && (products[i].getName().length() > key.getName().length())) {
                products[i + 1] = products[i];
                i--;
            }
            products[i + 1] = key;
        }
        return products;
    }
}
