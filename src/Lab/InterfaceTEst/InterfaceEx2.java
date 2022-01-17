package Lab.InterfaceTEst;

//[1] : 인터페이스
//추상 클래스와 거의 비슷하나 그 추상 정도가 더 높다(더 엄격하다) --> 일반 메서드나 멤버변수를 가질 수 없다.
//표준화 및 규격을 인터페이스로 제공 --> 일종의 "설계도" 개념.
// 따라서, 어떤 클래스가 해당 인터페이스를 사용한다면 인터페이스에 선언되어져 있는 메서드를 구현.
//인터페이스는 Interface 키워드를 사용.
// 추상 클래스와 같이 메서드의 구체적인 내용은 기술되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의 하여 사용.

//[2] : 상속
//클래스는 "단일 상속"만 가능, 인터페이스는 "다중 상속"이 가능 --> 가장 큰 차이점
class Person{
    String name;
    int age;
    int weight;

    Person(){}
    Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void wash(){
        System.out.println("씻다.");
    }
    void study(){
        System.out.println("공부하다다.");
    }
    void play(){
        System.out.println("놀다.");
    }

}
interface Allowance{
    //AbstraceMethod
    abstract void in(int price, String name);
    abstract void out(int price, String name);
}
interface Train{
    //AbstractMethod
    abstract void train(int trainint_pay, String name);
}

class Student extends Person implements Allowance,Train{

    public Student() {}
    public Student(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void in(int price, String name) {
        System.out.println("엄마에게서 10000원 용돈을 받았습니다.");
    }

    @Override
    public void out(int price, String name) {
        System.out.println("밖에서 돈을 50000원 잃어버렸습니다.");
    }

    @Override
    public void train(int training_pay, String name) {
        System.out.println("20000원 입금완료 ");
    }
}


public class InterfaceEx2 {

    public static void main(String[] args) {
//[1] : 객체 생성
        Student s1 = new Student("홍길동",20,85);
    }
}

//Person 클래스( 부모))
//A 인터페이스(부모)
//B 인터페이스(부모)
//Student 클래스(자식)
//메인 클래스(메인 메서드가 포함)

