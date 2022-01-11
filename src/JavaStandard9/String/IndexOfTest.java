package JavaStandard9.String;

public class IndexOfTest {
    public static void main(String[] args) {
        String str = new String("Oracle Java");
        System.out.println("원본 문자열 : " + str);  //원본 문자열 : Oracle Java

        System.out.println(str.indexOf('o'));   //소문자 o는 인수에 없으므로 -1을 출력
        System.out.println(str.indexOf('a'));   //소문자 a는 인수에서 [2]번째 있으므로 2 출력
        System.out.println(str.indexOf("Java"));    //문장 Java는 띄어쓰기를 초함하여 [7]번째 있으므로 7 출력
        System.out.println("indexOf() 메소드 호출 후 원본 문자열 : " + str);   //indexOf() 메소드 호출 후 원본 문자열 : Oracle Java
    }
}
