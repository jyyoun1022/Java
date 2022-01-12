package LackJava.listAndArray;

import java.util.ArrayList;
import java.util.Arrays;

//이미 대열베이터가 존재할 경우 쉽게 ArrayList 생성할수 있음.
public class Practice4 {
    public static void main(String[] args) {
        String[] data ={"138","129","142"}; //이미 투구수의 배열이 있다.
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(data));


        System.out.println(arrayList);
        System.out.println(arrayList.get(2));

    }
}
