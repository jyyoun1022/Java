class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}
class Student extends Person{
    String dept;


    public Student(String name) {
        super(name);
    }
}

public class CastingTest12{
    public static void main(String[] args) {
        Person person = new Student("업캐스팅");

        Student student =(Student)person;//다운캐스팅
        student.name ="윤재열";
        student.dept="미친과";
    //여기서 업캐스팅과 다른 점은 명시적으로 타입을 지정해야 한다는 점.
        //업캐스팅이 선행이 되야한다.
        //다운캐스팅을 하면서 형변환할 대상을 지정했지만 무분별한 다운캐스팅은 컴파일시점에는 오류가 발생하지 않아도 , 런타임 오류를 발생시킬 가능성이 있다.
    }
}
