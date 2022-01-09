package JavaStandard6;

public class ClassMethodTest {
    public static void main(String[] args) {
        System.out.println(ClassMethod.times(20,10));   //클래스메서드 호출

        ClassMethod cm = new ClassMethod(); //인스턴스 생성
        cm.a=20;    //인스턴스 변수
        cm.b=10;
        System.out.println(cm.add());   //인스턴스메서드 호출
    }
}
