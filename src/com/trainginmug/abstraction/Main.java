package com.trainginmug.abstraction;

public class Main {

    public static void main(String[] args) {

        //ProductServiceImpl productService = new ProductServiceImpl();

        //ProductService productService = new ProductService(); Abstract classes can't be instantiated

        //ProductService productService = new ProductServiceImpl();

        ProductService productService = new ProductServiceImpl2("admin_username", "admin_password");

        Product product = new Product(111, "Iphone 14 Pro Max", "Apple", 850.5F, 8.5F, 4.5F);
        productService.addProduct(product);
        productService.configurationDetails();
        System.out.println(productService.PRODUCT_URL);

        System.out.println("--------------Interfaces-------------");
        IProductService prodService = new ProductServImpl2();
        prodService.addProduct(product);
        prodService.getProduct(111);

        System.out.println("Product Price from the Interface : " + IProductService.PRODUCT_PRICE);

        //IProductService prod = new IProductService(); //interfaces can't be instantiaded

        Sellable sellable = new ProductServImpl2();
        sellable.manufacturerDetails();
        sellable.sellerDetails();

    }
}
