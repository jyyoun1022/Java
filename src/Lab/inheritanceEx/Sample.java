package Lab.inheritanceEx;

public class Sample {
    public static void main(String[] args) {
        //[1] : 객체 생성
        Person p1 = new Person();
        p1.move();
        //[2] : 슈퍼맨 객체생성
        Hero h1 = new Hero(500,1,"슈퍼맨",24);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.sex);
        System.out.println(h1.power);
        h1.displayPerson();
        h1.move();
        h1.eat();

        //[3] : 원더우맨 객체생성
        Hero h2 = new Hero(300,2,"원더우먼",90);
        h2.sex=2;
        h2.power=300;
        h2.move();  //만약 Hero에 move메서드를 재정의 하지 않았다고한다면 부모 클래스것이 출력된다.
        h2.eat();
        h2.displayPerson();

        Person p12 = h2;
        p12.move();
    }
}
