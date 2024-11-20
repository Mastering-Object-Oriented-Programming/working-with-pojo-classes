package com.trainginmug.abstraction;

public class ProductServiceImpl extends ProductService{

    @Override //annotation
    void addProduct(Product product){
        System.out.println("Product is Successfully added to the MySQL database!");
    }
}
