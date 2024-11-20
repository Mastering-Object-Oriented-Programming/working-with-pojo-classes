package com.trainginmug.abstraction;

public abstract class ProductService {

    //Business Methods
    //2. Abstract class can have static final, normal variables
    static final String PRODUCT_URL = "http://192.168.99.100";

    String username = "admin";

    String password = "admin@123";

    //3. abstract classes can have constructors

    public ProductService() {
        System.out.println("ProductService() constructor");
    }

    public ProductService(String username, String password) {
        System.out.println("Product(String, String) constructor");
        this.username = username;
        this.password = password;
    }

    abstract void addProduct(Product product);

    //1. abstract classes can also have non-abstract (concrete) method

    void configurationDetails(){
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }

}
