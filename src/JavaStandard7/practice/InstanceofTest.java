package JavaStandard7.practice;

import JavaStandard7.practice.Car;
import JavaStandard7.practice.FireEngine;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine instance");
        }
        if(fe instanceof Car){
            System.out.println("This is a Car instance");
        }
        if(fe instanceof Object){
            System.out.println("This is an Object instance");
        }


        }
    }

