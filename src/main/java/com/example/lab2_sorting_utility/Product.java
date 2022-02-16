package com.example.lab2_sorting_utility;

import java.util.Objects;

public class Product implements Comparable<Product> {
    int ID;
    String name;
    float price;

    public Product(int ID, String name, float price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }
    public Product(Product other){
        this.ID = other.ID;
        this.name = other.name;
        this.price = other.price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ID == product.ID && Float.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Product o) {
        if(this.ID > o.ID)
        {
            return 1;
        }
        else if (this.ID < o.ID)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
