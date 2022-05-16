import Entity.Product;

public class Bai15minByPrice {
    public Product minByPrice(Product[] products){
        int max=products[0].getPrice();
        for(Product pr:products){
            if(pr.getPrice()<max){
                max=pr.getPrice();
            }
        }
        for (Product pr:products
        ) {
            if(pr.getPrice()==max)
            {
                return pr;
            }
        }
        return null;
    }
}
