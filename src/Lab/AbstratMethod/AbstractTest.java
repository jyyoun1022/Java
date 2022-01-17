package Lab.AbstratMethod;

abstract  class Animal{ ///구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언> 리턴값 조차도 없이 메서드만 선언
    abstract void cry();
    void eat(){
        System.out.println("먹다");
    }
}
class Animal2{
    void fly(){
        System.out.println("날다");
    }

}
class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍~");
    }
}
abstract class Cat extends  Animal{
//    @Override
//    void cry() {
//        System.out.println("야옹~");
//    }
}
class Cow extends  Animal{
    @Override
    void cry() {
        System.out.println("음메~");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
    //[1] : 추상클래스는 구체적인 내용이 없기 때문에 객체를  생성할 수 없다.
        //Animal animal = new Animal();   //ERROR
        Animal2 dragonfly = new Animal2();   //에러가 나지를 않는다.
        dragonfly.fly();
    //[2] : 추상 클래스 사용은 >> 상속을 받아서 사용
        //즉, 추상(부모) 클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한 후 사용한다.
    Dog dog = new Dog();
    dog.cry();  //멍멍~ 출력
//    Cat cat = new Cat();
//    cat.cry();  //야옹~출력
         Cow cow = new Cow();
         cow.cry();
         cow.eat();
        //[3] : Summary
        //추상 클래스는 다른 클래스들의 공통적인 특징을 변수나 메서드로 정의만 해놓는 것을 말한다.>>추상 메서드
        //abstract를 앞에 붙이고 클래스 안에 추상 메서드를 포함하고 있따는 것을 제외하면 클래스와 별반 차이가 없다.
        //Field, Constructor, Method(추상 메서드 말고 일반메서드)도 포함할 수 있다.
        //매서드도 선언만 있고 구체적인 내용은 없으므로 객체를 생성할 수 없다.
        //따라서, 부모 클래스로서의 역할은 하지만,구체적인 사용은 상속받은 자식클래스에서 재정의하여 사용하라고 한다.
        //추상 클래스에서 선언만 해놓음으로써 이후 새로운 (자식)클래스들이 이를 상속 받아 구현하므로 새로운 클래스를 작성할 때 하나의 틀이 된다.

        //왜쓰지?
        //1.우선 강제하기 위함이다.
        //2. 부모클래스가 선언해놓은 메서드를 상속받은 자식클래스들이 이름 그대로 재정의해서 구현하라고 강제하는것이다.
        //3. 상속받은 자식 클래스 입장에서는 자칫 상속만 받고 재정의해서 사용을 안할 수 있기 때문이다.
        //즉, 일반 메서드로 구현하면 누군가는 해당 메서드를 구현 안 할 수도 있다.
        //무조건 상속받은 자식 클래스 입장에서는 추상 메서드를 재정의하여 구현하도록 강제하기 위함이다.
        //위의 cat클래스에서 재정의한 cry() 메서드를 지워보면 에러가 발생한다.이유는 추상 메서드를 오버라이딩하지 않아서이다.
        //추상 메서드를 포함하고 있다면 곧 추상 클래스여야 한다.

        //만약 재정의 하고 싶지 않다면?
        //자식 클래스에서 상속받은 추상 메서드를 구현하지 않는다면, 자식클래스도 abstract를 붙여서 추상으로 만들어준다.
        //class 앞에다가 abstract를 붙인다.

        //결론.
        //부모 클래스에 구현을 하지 않는 이유는 해당 메서드의 구현이 상속받는 클래스에 따라서 달라질 수 있기 떄문에 선언만 해둔 것이다.
        //마치 돈 많은 부모가 엄청난 땅만 상속해주고 용도는 자식을이 사용해라( 이런 느낌이다.)
        // 이러한 추상클래스는 여러명의 개발자가 작업할 때 코드의 확장과 분업을 효율적으로 처리할 수 있게 해준다.
        //분열화된 시스템에서 공통의 프로젝트를 진행할 때 많이 사용되어지는 중요한 문법이다.



    }
}
