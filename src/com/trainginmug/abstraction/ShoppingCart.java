package com.trainginmug.abstraction;

public class ShoppingCart {

    Product product;

    //Tightly Coupled
    /*public ShoppingCart() {
        this.product = new Product(111, "Iphone 14 Pro Max", "Apple", 850.5F, 8.5F, 4.5F);
    }*/
    //loosely Coupled
    public ShoppingCart(Product product) {
        this.product = product;
    }

    float finalPrice(){
        return product.price - (product.price * product.discountPercentage/100);
    }

}
