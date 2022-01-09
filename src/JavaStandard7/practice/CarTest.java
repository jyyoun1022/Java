package JavaStandard7.practice;

import JavaStandard7.practice.Car;
import JavaStandard7.practice.FireEngine;

public class CarTest {
    public static void main(String[] args) {
        Car c =null;    //초기화;
        FireEngine f = new FireEngine();
        FireEngine f1 = new FireEngine();

        f.water();
        c =  f;  //c = (car)f; 조상 <- 자손
        //c.water();
        f1 = (FireEngine) c;    //자손 <- 조상
        f1.water();
    }
}
