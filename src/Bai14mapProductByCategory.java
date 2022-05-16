import Entity.Category;
import Entity.Product;

public class Bai14mapProductByCategory {
    public Product[] mapProductByCategory(Product[] products, Category[] categories) {
        for (Product pr : products
        ) {
            for (Category ct : categories
            ) {
                if (pr.getCategoryID() == ct.getId()) {
                    pr.setNamecategory(ct.getName());
                }
            }
        }
        return products;
    }
}
