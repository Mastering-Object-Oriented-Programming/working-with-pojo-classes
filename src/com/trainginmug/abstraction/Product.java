package com.trainginmug.abstraction;

public class Product {
    int id;
    String name;
    String brand;
    float price;
    float discountPercentage;
    float rating;

    public Product(){
    }

    public Product(int id, String name, String brand, float price, float discountPercentage, float rating) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
    }
}
