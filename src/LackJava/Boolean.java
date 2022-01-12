package LackJava;

import java.sql.SQLOutput;

public class Boolean {
    public static void main(String[] args) {

     int base = 180;
     int height = 185;
     boolean isTall = height > base;

 if(isTall){
        System.out.println("키가 큽니다.");
    }else
        System.out.println("키가 작습니다.");

 String a = "Java";
 String b = "Java";

        System.out.println(a.equals(b));
        String c = "Hello";
        String d = c;
        System.out.println(d);
        System.out.println(c.equals(d));

        String str = new String("java");
        System.out.println(str);
}
}
