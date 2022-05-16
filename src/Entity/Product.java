package Entity;

public class Product {
    String name;
    int price;
    int quality;
    int categoryID;
    String namecategory;

    public String getNamecategory() {
        return namecategory;
    }

    public void setNamecategory(String namecategory) {
        this.namecategory = namecategory;
    }

    public Product(String name, int price, int quality, int categoryID, String namecategory) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryID = categoryID;
        this.namecategory = namecategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                ", categoryID=" + categoryID +
                ", namecategory='" + namecategory + '\'' +
                '}';
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Product(String name, int price, int quality, int categoryID) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryID = categoryID;
    }
}
