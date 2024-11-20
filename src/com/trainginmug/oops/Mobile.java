package com.trainginmug.oops;

public class Mobile extends Product { //Derived class, Sub class, Child class (Parent to com.trainginmug.oops.SmartPhone)

    float  processor;
    float ramSize;
    String celluarTechnology;

    String condition;

    public Mobile(){
        super(); //super call -> invokes super class constructor
        System.out.println("Price: " + price);
        System.out.println("com.trainginmug.oops.Mobile constructor is invoked..");
    }

    public Mobile(int id, String name, String brand, float price, float discountPercentage, float rating, String condition, float processor, float ramSize, String celluarTechnology) {
        super(id, name, brand, price, discountPercentage, rating, condition);
        this.processor = processor;
        this.ramSize = ramSize;
        this.celluarTechnology = celluarTechnology;
        this.condition="OLD";
    }

    //method overriding
    void displayDetails(){
        /*System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);*/

        super.displayDetails(); //super keyword is used to invoke base class properties
        System.out.println("Price : " + super.price);
        System.out.println("Processor : "+ processor);
        System.out.println("Ram Size : " + ramSize);
        System.out.println("Operating Technology : " + celluarTechnology);
        System.out.println("Condition : "+condition);
    }
    //method overloading
    void displayProducts(String celluarTechnology){
        System.out.println("Display all Mobiles based on cellular Technology : " + celluarTechnology);
    }

   //@Override
    void displayProducts(float minRating){
        System.out.println("Displaying Mobiles Based on MinRating : " + minRating);
    }


}
