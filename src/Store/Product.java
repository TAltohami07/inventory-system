package Store;

public class Product {

    private int id;
    private int quantity;
    private double price;
    private String name;

    public Product(int id,String name,int quantity,double price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public int getId() {return id;}

    public int getQuantity() {return quantity;}

    public double getPrice() {return price;}

    public String getName() {return name;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
