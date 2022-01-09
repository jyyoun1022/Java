package JavaStandard7.practice;

public class Parent {
    public int x=10;
}
class Child extends Parent{
    public void method(){
         int x=20;
        System.out.println("X="+x);
        System.out.println("this.x=" +this.x);
        System.out.println("super.x="+super.x);
    }
}
