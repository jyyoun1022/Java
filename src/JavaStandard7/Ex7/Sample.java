package JavaStandard7.Ex7;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] data ={1,3,5,7,9};
        Calculator cal = new Calculator();
        double result =cal.average(data);
        System.out.println(result);

        ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        Calculator cal2 = new Calculator();
        double result1 = cal2.average(data1);
        System.out.println(result1);


    }
}
