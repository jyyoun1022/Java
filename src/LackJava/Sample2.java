package LackJava;

class Animal1{
    String name;

    public void setName(String name){
        this.name = name;
    }
}
public class Sample2 {
    public static void main(String[] args) {
        Animal1 cat = new Animal1();
        cat.setName("body");
        System.out.println(cat.name);
    }
}
