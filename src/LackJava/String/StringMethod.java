package LackJava.String;

import java.lang.reflect.Array;

public class StringMethod {
    public static void main(String[] args) {
        String a = "a:b:c:b";

        System.out.println(a.split(":"));
        String[] result = a.split(":");

        for (String s : result) {
            System.out.println(s);}



            String str = "010-4623-2891";
            String[] temp = str.split("-");

                   String fNum = temp[0];//010
                   String mNum = temp[1];//4623
                   String lNum = temp[2];//2891


                System.out.println(fNum);
                System.out.println(mNum);
                System.out.println(lNum);




            String str2 = "91-2-010-4623-2891";
            String[] temp2 = str2.split("-",4);
        System.out.println(temp2.length);
        System.out.println(temp2[0]);
        System.out.println(temp2[1]);
        System.out.println(temp2[2]);
        System.out.println(temp2[3]);



        }
    }
