import Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Bai5Function {
    public List<Product> findProductByCategory(Product[] listProduct, int   categoryID)
    {
        List<Product> products=new ArrayList<>();
        for (Product pr: listProduct
        ) {
            if(pr.getCategoryID()==categoryID)
            {
                products.add(pr);
            }
        }
        return products;
    }
}
