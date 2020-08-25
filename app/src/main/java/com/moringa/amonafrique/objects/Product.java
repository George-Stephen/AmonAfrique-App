package com.moringa.amonafrique.objects;

public class Product {
    private String name;
    private String make;

    public Product(String name, String make) {
        this.name = name;
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
