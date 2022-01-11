package JavaStandard9.equals;

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);//두 인스턴스는 다른 주소에 있기 때문에 false
        System.out.println(str1.equals(str2));//값이 같냐?주소는 달라도되.논리적 동일성
    }
}
