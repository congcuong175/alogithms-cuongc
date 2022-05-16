import Entity.Category;
import Entity.Menu;
import Entity.Product;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Bai4Function {
    static class KhoiTao{
        public Product findProduct(Product[] listProduct,String nameProduct)
        {
            for (Product pr: listProduct
            ) {
                if(pr.getName().equalsIgnoreCase(nameProduct))
                {
                    return pr;
                }
            }
            return null;
        }
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
        public List<Product> findProductByPrice(Product[] listProduct,int price){
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
        //BubbleSort
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
        //InsertionSort
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
        //Bai13
        public List<Product> sortByCategoryName(Product[] products, Category[]categories){
            List<Product>list=new ArrayList<>();
            int n = categories.length;
            for (int j = 1; j < n; j++) {
                Category key = categories[j];
                int i = j - 1;
                while ((i > -1) && (categories[i].getName().compareTo( key.getName()))>0) {
                    categories[i + 1] = categories[i];
                    i--;
                }
                categories[i + 1] = key;
            }

            for (Category ct:categories
                 ) {
                for (Product pr:products
                     ) {
                    if(ct.getId()==pr.getCategoryID())
                    {
                        list.add(pr);
                    }
                }
            }
            return list;
        }
        public Product[] mapProductByCategory(Product[] products, Category[]categories){
            for (Product pr: products
                 ) {
                for (Category ct:categories
                     ) {
                    if(pr.getCategoryID()==ct.getId()){
                        pr.setNamecategory(ct.getName());
                    }
                }
            }
            return products;
        }
        //Bai 15
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
        //Bai 16
        public Product maxByPrice(Product[] products){
            int max=products[0].getPrice();
            for(Product pr:products){
                if(pr.getPrice()>max){
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
        //Bai 21 Đệ qui
        public double calSalary(double salary, int n){
            if(n==0){
                return salary;
            }
            return calSalary(salary*1.1,n-1);
        }
        //Bai 21 Không đệ qui
        public double calSalary2(double salary, int n){
            for (int i=0;i<n;i++){
                salary*=1.1;
            }
            return salary;
        }
        //Bai 22
        public int calMonth(double money,double rate,int n){
            double tongtien= money*Math.pow((1+rate),n);
            if(tongtien-money>money){
                return n;
            }
            return calMonth(money,rate,n+1);
        }
        //Bai 22 Không đệ qui
        public int calMonth2(double money,double rate){
            int n=0;
            double tongtien=0;
            while (tongtien-money<money){
                n++;
                tongtien= money*Math.pow((1+rate),n);

            }
            return n;
        }
        public void printMenu(){
            Gson gs=new Gson();
            Menu[]menus=null;
            try {
                FileReader reader=new FileReader("C:\\Users\\CongCuong\\IdeaProjects\\alogithms-cuong\\src\\menu.json");
                menus=gs.fromJson(reader,Menu[].class);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            for (Menu mn:menus){
                if(mn.getParent_id()==0){
                    System.out.println(mn.getTitle());
                    for (Menu mn2:menus){
                        if(mn2.getParent_id()==mn.getId()){
                            System.out.println("--"+mn2.getTitle());
                            for (Menu mn3:menus){
                                if(mn3.getParent_id()==mn2.getId()){
                                    System.out.println("----"+mn2.getTitle());
                                }
                            }
                        }
                    }
                }

            }
        }
        public void Run(){
            Product[] products=new Product[]{new Product("CPU",  750,  10, 1),
                    new Product("RAM",  50,  2, 2),
                    new Product("HDD",  70,  1, 2),
                    new Product("Main",  400,  3, 1),
                    new Product("Keyboard",  30,  8, 4),
                    new Product("Mouse",  25,  50, 4),
                    new Product("VGA",  60,  35, 3),
                    new Product("Monitor",  120,  28, 2),
                    new Product("Case",  120,  28, 4)
            };
            Category[] categories=new Category[]{
                    new Category(1,"Computer"),
                    new Category(2,"Memory"),
                    new Category(3,"Card"),
                    new Category(4,"Acsesory")
            };
            for (Product pr:mapProductByCategory(products,categories)
                 ) {
                System.out.println(pr.toString());
            }
            printMenu();

        }
    }
    public static void main(String[] arr){
        KhoiTao fc=new KhoiTao();
        fc.Run();

    }

}
