package LackJava;

public class Sample555 {
    class Person{
        int age;
        String name;
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public void method_1(){
        Person person = new Person(25,"Nick");
        System.out.println("Before Call Method2 : " + person.age +", name = " +person.name + ")");
        method_2(person);
        System.out.println("After Call Method2 : " + person.age +", name = " +person.name + ")");
    }

    public void method_2(Person person) {
        person.age =22;
        person.name = "Ahn";
        System.out.println("Inside Call Method2 : " + person.age +", name = " +person.name + ")");
    }

    public static void main(String[] args) {
        Sample555 sample = new Sample555();
        sample.method_1();
    }
}
