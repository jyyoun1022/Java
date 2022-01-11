package JavaStandard9.StringBuffer;

public class DeleteTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java Oracle");

        System.out.println("원본 문자열 : " + str);
        System.out.println(str.delete(4, 8));   // 인수 Java Oracle 에서의 인덱스 4부터 8까지 삭제 한다. 따라서 Javacle 출력.
        System.out.println(str.deleteCharAt(1));    //index 1 위치에 있는 문자한개를 제거 'a'를 삭제하면. Jvacle 출력
        System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str);  //deleteCharAt() 메소드 호출 후 원본 문자열 : Jvacle
    }
}
