package Lab;
class Parent{
    void familyName(){
        System.out.print("김");
    }
    void name(){
        familyName();
        System.out.print("철수");
    }
}
class Son extends  Parent{
    @Override
    void name() {
        familyName();
        System.out.print("인직");
    }
}
class Daughter extends Parent{
    @Override
    void name() {
        familyName();
        System.out.print("이븐");
    }
}

public class NameTest {
    public static void main(String[] args) {
        Son son1 = new Son();
        Daughter d1 = new Daughter();
        Parent p1 = new Son();
        p1.name();
        System.out.println();
        Son son = (Son)p1;
        son.name();
        System.out.println();
        Parent p2 = son1;
        p2.name();
    }
}
