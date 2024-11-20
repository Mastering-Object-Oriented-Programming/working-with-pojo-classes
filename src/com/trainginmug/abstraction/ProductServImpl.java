package com.trainginmug.abstraction;

public class ProductServImpl implements IProductService, Sellable{


    //we can't have super()
    @Override
    public void addProduct(Product product){
        System.out.println("Product is Successfully added to the MySQL database!");
    }

    @Override
    public void getProduct(int id) {
        System.out.println("Fetching the product from MySQL database with ID : " + id);
        System.out.println("Product Price : " + PRODUCT_PRICE);
    }

    @Override
    public void manufacturerDetails() {
        System.out.println("Manufacturer Name : TrainingMug Pvt Ltd");
        System.out.println("Manufacturer email : manufacturer@trainginmug.com");
    }

    @Override
    public void sellerDetails() {
        System.out.println("Seller Name : TrainingMug Pvt Ltd");
        System.out.println("Seller Email : seller@trainingmug.com");
    }

}
