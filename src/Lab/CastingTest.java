package Lab;
class Person{
    String name ="이유신";
    void identify(){
        System.out.println("부모클래스것입니다.");
    }

}
class Student extends Person{
    String name = "이자식";

    @Override
    void identify() {
        System.out.println("자식클래스입니다.");
    }
    public void sonclass(){
        System.out.println("다운캐스팅 마스터해보자");
    }

}

public class CastingTest {

    public static void main(String[] args) {
        Person human1 = new Student();
        human1.identify();
        System.out.println(human1.name);
        Student student =(Student) human1;
        System.out.println(student.name);
        student.sonclass();

    }

}
