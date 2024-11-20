package com.trainginmug.oops;

public class Product { //Base class, Super class, Parent class
    //final classes can't be inherited
    int id;
    String name;
    String brand;
    float price;
    float discountPercentage;
    float rating;

    String condition;

    public Product(){
        System.out.println("com.trainginmug.oops.Product constructor Invoked..");
    }
    //constructor overloading
    public Product(int id, String name, String brand, float price, float discountPercentage, float rating, String condition) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.condition = condition;
    }
    //Creating based on requirement
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayDetails(){//final methods can't be overridden
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);
        System.out.println("Condition : " + condition);
    }

    final void displayProducts(){
        System.out.println("Display All Products...");
    }

    void displayProducts(float minRating){
        System.out.println("Display all products with min rating : " + minRating);
    }

    void displayProducts(float minPrice, float maxPrice){
        System.out.println("Display all products with min price : " + minPrice + " and max price : " + maxPrice);
    }
//->Not allowed
//    List<com.trainginmug.oops.Product> displayProducts(float minPrice, float maxPrice) {
//
//    }

    void displayProducts(String brand){
        System.out.println("Display all products from the brand : " + brand);
    }
//->Not allowed
//    void displayProducts(float discountPercentage){
//
//    }

}
