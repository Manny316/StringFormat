package com.college.link;

import com.college.link.factories.CarFactory;
import com.college.link.pojos.Car;

public class Application {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car myCar = factory.initThisCar();
        System.out.println("Car is "+myCar.getColor()+" and has alarm: "+myCar.hasAlarm());
    }
}
