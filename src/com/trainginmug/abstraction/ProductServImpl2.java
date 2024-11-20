package com.trainginmug.abstraction;

public class ProductServImpl2 implements IProductService, Sellable{
    @Override
    public void addProduct(Product product) {
        System.out.println("Product is successfully added to Oracle Database");
    }

    @Override
    public void getProduct(int id) {
        System.out.println("Fetching the product from Oracle Database with ID : " + id);
        //PRODUCT_PRICE = 2000;
        System.out.println("Product Price : " + PRODUCT_PRICE);
    }

    @Override
    public void manufacturerDetails() {
        System.out.println("Manufacturer Name : Microsoft Pvt Ltd");
        System.out.println("Manufacturer email : manufacturer@microsoft.com");
    }

    @Override
    public void sellerDetails() {
        System.out.println("Seller Name : Microsoft Pvt Ltd");
        System.out.println("Seller Email : seller@microsoft.com");
    }
}
