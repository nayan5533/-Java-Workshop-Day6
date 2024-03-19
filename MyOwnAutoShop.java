/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myownautoshop;

/**
 *
 * @author nayan
 */
class Car {
    int speed;
    double regularPrice;
    String color;
    
    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        
    }
    
    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;
    
    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; //10%
        } else {
            return regularPrice * 0.08; //20%
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    Ford (int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    
    double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;
    
    Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice, color);
        this.length = length;
    }
    
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95; //5%
        } else {
            return regularPrice * 0.9;  //10%
        }
    }
}


public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Red", 22);
        Ford ford1 = new Ford(130, 25000, "Blue", 2019, 1500);
        Ford ford2 = new Ford(140, 30000, "Green", 2020, 2000);
        Car car = new Car(110, 15000, "Black");
        
        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}
