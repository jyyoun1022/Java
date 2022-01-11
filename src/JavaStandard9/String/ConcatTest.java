package JavaStandard9.String;

public class ConcatTest {
    public static void main(String[] args) {

        String str = new String("Java");
        System.out.println("원본문자열 : " + str);   //원본문자열 : Java
        System.out.println(str.concat("수업"));   //Java수업
        System.out.println("concat()메서드 후 원본문자열 : " + str); //concat()메서드 후 원본문자열 : Java
    }
}
