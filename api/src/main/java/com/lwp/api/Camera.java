package com.lwp.api;

import java.io.Serializable;

public class Camera implements Serializable {
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public Camera setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Camera setModel(String model) {
        this.model = model;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Camera setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "[" + brand + "]" +
                "[" + model + "]" +
                "[" + price + "]";
    }
}