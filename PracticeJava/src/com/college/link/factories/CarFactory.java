package com.college.link.factories;

import com.college.link.pojos.Car;

public class CarFactory {

    public  Car initThisCar(){
        Car car = new Car();
        car.setColor("red");
        car.setHasAlarm(false);
        return car;
    }
}
