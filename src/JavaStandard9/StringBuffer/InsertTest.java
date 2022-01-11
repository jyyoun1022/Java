package JavaStandard9.StringBuffer;

public class InsertTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java 만세!!");

        System.out.println("원본 문자열 : " + str);  //원본 문자열 : Java 만세!!
        System.out.println(str.insert(4, "Script"));    //JavaScript 만세!!
        System.out.println("insert() 메소드 호출 후 원본 문자열 : " + str);    //insert() 메소드 호출 후 원본 문자열 : JavaScript 만세!!
    }
}
