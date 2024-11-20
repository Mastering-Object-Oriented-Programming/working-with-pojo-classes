package com.trainginmug.abstraction;

public class Laptop {

    float processor;
    float ramSize;
    String operatingSystem;

    public Laptop() {

    }

    public Laptop(float processor, float ramSize, String operatingSystem) {
        this.processor = processor;
        this.ramSize = ramSize;
        this.operatingSystem = operatingSystem;
    }
}
