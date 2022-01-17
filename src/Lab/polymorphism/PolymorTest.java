package Lab.polymorphism;

//[1] : 다형성이란?
//다형성이란 다양한 형태 또는 특성을 가진다는 의미이다.
//자바와 같은 객체 지향 언어에서의 의마는 부모 클래스를 상속받은 자식 클래스의 인스턴스가 부모의 객체로도 사용되고,
//뿐만 아니라, 자식클래스의 객체로도 사용할 수 있는 다양한 상황을 의미한다.

//[2] : 예시
//부모 클래스 Bird 가 있고, 이를 상속받은 자식 클래스 Parrot이 있다고 가정하자.
//이떄 " 앵무새가 말을하네~허허~"사람들이 이렇게 말할 수 있다.
//그런데, 앵무새는 새기 때문에 "새가 말을하네.하하"라고도 할수 도 있다.

//[3] : 결론
//정리하면 하위 클래스의 인스턴스(객체)는 보다 위인 상위 클래스의 인스턴스(객쳬)로도 사용할  수 있다.
//하지만 그 반대는 안된다.
//왜냐하면 "앵무새"는 분명 그 상위 인 "새"라고 말할 수 있지만. 새는 종류가 많기 때문에 모든 새가 앵무새가 아니다.
//따라서, 상위클래스의 인스턴스는 하위클래스의 인스턴스로 사용될 수 없다.

class Person{
    String str1="난 부모 클래스";
    void method(){
        System.out.println("에이에이에이");
    }
    void ppp(){
        System.out.println("ppp");
    }
}
class Student extends Person{
    String str2 ="난 자식 클래스";

    @Override
    void method() {
        System.out.println("오버라이딩 -AAA");;
    }
    void sss(){
        System.out.println("sss");
    }
    void x(){
        super.method();
    }
}

public class PolymorTest {
    public static void main(String[] args) {
        //[1] : 객체 생성-->부모+자식 클래스의 모든 자원을 다 쓸 수 있다.
        Student s1 = new Student();    //지극히 정상
        System.out.println(s1.str1);
        System.out.println(s1.str2);
        s1.ppp();
        s1.method();
        s1.sss();
        //[!] : 그런데 만약 --> 자식 클래스에서 오버라이딩된 부모 클래스의 메서드를 호출하고 싶다.

        //자식의 메서드를 바로 호출하고 싶다면?
        //

        //[2] : 객체 생성-->부모 클래스의 자원만을 쓸수 있다.
        Person s2 = new Student();    //이것도 정상-->하위클래스로 객체를만들면서 타입은 상위타입을 쓰는 것이 가능하다.이것이 다형성
        System.out.println(s2.str1);
        s2.ppp();
        s2.method();
        //[i] : 그런데 만약 자식의 메서드를 바로 호출하고 싶다면?

        //[3] : 객체 생성-->부모클래스의 자원만 쓸소 있다..
        Person s3 = new Person();   //지극히 정상
        s3.method();
        System.out.println(s1.str1);
        //[4] : 객체 생성
        //Student student3 = new Person();    //컴파일 오류발생-->상위클래스로 객체를만들면서 타입은 하위 타입으로 할 수는 없다.


        System.out.println("=================================================");
        //Person person = new Student();일때 하위클래스의 메서드를 바로 호출하고싶을때
        //캐스팅(형변환)을 하면 된다.
        ((Student)s2).sss();    ///student메서드 바로 호출 ,sss출력;
        //Student student = new Student();일때 상위 클래스의 메서드를 호출하고싶을때.
        s1.x();



    }
}
