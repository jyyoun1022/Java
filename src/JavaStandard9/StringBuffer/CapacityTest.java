package JavaStandard9.StringBuffer;

public class CapacityTest {
    public static void main(String[] args) {
        StringBuffer str01 = new StringBuffer();    //
        StringBuffer str02 = new StringBuffer("Java");
        System.out.println(str01.capacity());   //기본으로 생성 되는 여유 버퍼 크기 : 16
        System.out.println(str02.capacity());   //기본적으로 생성되는 여유 버퍼 크기인 16에 문자의 길이인 4를 더한 총 20개의 문자를 저장할 수 있는 버퍼가 생성되
    }
}
