package com.trainginmug.abstraction;

public class ProductServiceImpl2 extends ProductService{

    public ProductServiceImpl2() {
    }

    public ProductServiceImpl2(String username, String password) {
        super(username, password);
    }

    @Override
    void addProduct(Product product){
        System.out.println("Product is successfully added to Oracle Database!!");
    }

}
