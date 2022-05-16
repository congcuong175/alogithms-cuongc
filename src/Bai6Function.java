import Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Bai6Function {
    public List<Product> findProductByPrice(Product[] listProduct, int price){
        List<Product> products=new ArrayList<>();
        for (Product pr: listProduct
        ) {
            if(pr.getPrice()<=price )
            {
                products.add(pr);
            }
        }
        return products;
    }
}
