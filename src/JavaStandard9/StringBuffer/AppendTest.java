package JavaStandard9.StringBuffer;

public class AppendTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println("원본 문자열 : " + str);  //원본 문자열 : Java

        System.out.println(str.append("수업"));   //Java수업
        System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);    //append() 메소드 호출 후 원본 문자열 : Java수업
    }
}
