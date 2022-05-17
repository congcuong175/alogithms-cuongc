import Entity.Category;
import Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Bai13InsertionSort {
    public List<Product> sortByCategoryName(Product[] products, Category[] categories) {
        List<Product> list = new ArrayList<>();
        int n = categories.length;
        for (int j = 1; j < n; j++) {
            Category key = categories[j];
            int i = j - 1;
            while ((i > -1) && (categories[i].getName().compareTo(key.getName())) > 0) {
                categories[i + 1] = categories[i];
                i--;
            }
            categories[i + 1] = key;
        }

        for (Category ct : categories) {
            for (Product pr : products) {
                if (ct.getId() == pr.getCategoryID()) {
                    list.add(pr);
                }
            }
        }
        return list;
    }
}
