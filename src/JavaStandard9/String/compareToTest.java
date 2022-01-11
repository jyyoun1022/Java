package JavaStandard9.String;

public class compareToTest {
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("원본 문자열 : " + str);  //원본 문자열 : abcd
        System.out.println(str.compareTo("bcef"));  // 인수 abcd는 해당문자열 bcef 보다 1만큼 작으니까 -1
        System.out.println(str.compareTo("abcd"));  // 인수 abcd는 해당문자열 abcd 와 같으므로 0
        System.out.println(str.compareTo("Abcd"));  // 인수 abcd는 해당문자열 Abcd 보다 32먄큼 크므로 32
        System.out.println(str.compareToIgnoreCase("Abcd"));    ///compareToIgnoreCase()메서드를 사용하여 대,소문자 구분이 사라졌으니 0
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str); //compareTo() 메소드 호출 후 원본 문자열 : abcd
    }
}
