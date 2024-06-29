package Buoi5;

public class MyPhone {
    public String name;
    public String brand;
    public int quantity;
    public int price;

    public MyPhone() {

    }

    public MyPhone(String name, String brand, int quantity, int price) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyPhone [name=" + name + ", brand=" + brand + ", quantity=" + quantity + ", price=" + price + "]";
    }

}
