package com.trainginmug.abstraction;

public interface IProductService {

    //2. interfaces supports only static final variables


    public static final int PRODUCT_PRICE = 1000;

    public static final String USER_NAME = "admin";

    //3. interfaces doesn't support constructor

    //contains only abstract classes
    void addProduct(Product product);//public abstract (by default)
    void getProduct(int id);

    //1. interfaces can't have concrete methods
}
