package com.trainginmug.oops;

public class ProductService {

    //at Runtime com.trainginmug.oops.Product can change to (com.trainginmug.oops.Mobile, com.trainginmug.oops.Camera, com.trainginmug.oops.SmartPhone, com.trainginmug.oops.Laptop) - based on arguments we pass
    void productDetails(Product product){
        product.displayDetails();
    }
}
