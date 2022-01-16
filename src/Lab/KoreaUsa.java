package Lab;

import java.util.Locale;

public class KoreaUsa {

    public static String[] capitalMethod(String a,String b){
        a=a.toUpperCase();
        b=b.toLowerCase();

        String[]str1={a,b};
        return str1;
    }

    public static void main(String[] args) {
    //[1] : 반환값 >> o,  받는인자값 >> o
        //반환값이 있다는 것은 메서드호출에 따른 리턴값이 있다는 것.>>호출부에서 리턴값을 받는 변수 정의.
        String[] str = capitalMethod("korea","USA");
        //[2] : 출력
        System.out.println(str);
        System.out.println(str[0]+","+str[1]);
    }
}
