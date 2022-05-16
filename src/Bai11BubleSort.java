import Entity.Product;

public class Bai11BubleSort {
    public Product[] sortByPrice(Product[] products){
        int n = products.length;
        Product temp = null;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(products[j-1].getPrice() > products[j].getPrice()){
                    temp = products[j-1];
                    products[j-1] = products[j];
                    products[j] = temp;
                }

            }
        }
        return products;
    }
}
