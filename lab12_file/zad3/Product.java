package zad3;

public class Product implements Comparable<Product>{
    String name;
    double price;
    int productionYear;

    @Override
    public int compareTo(Product o) {
    return Integer.compare(this.productionYear,o.productionYear);
    }
    public Product(String name,double price,int productionYear){
        this.name = name;
        this.price = price;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "rok produkcji " + productionYear;
    }
}
