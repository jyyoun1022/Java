package JavaStandard7.Ex7;

import java.util.ArrayList;

public class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
//    public double avg(int[] data){
//        int i=0;
//        int sum = 0;
//        double result=0;
//        for(i=0; i<data.length; i++){
//            sum += data[i];
//        }
//        return result =sum/data.length;
//    }
//    public double avg(ArrayList<Integer> data){
//        int i = 0;
//        int sum = 0;
//        double result=0;
//        for(i=0; i<data.size(); i++){
//            sum += data.get(i);
//        }
//        return  result = sum/data.size();
//    }
    public int average(int[] data){
        int total = 0;
        for(int num : data){
            total += num;
        }
        return total/data.length;
    }
    public int average(ArrayList<Integer>data){
        int total = 0;
        for(int num : data){
            total += num;
        }
        return total/data.size();
    }
}
