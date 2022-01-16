package Lab;

class FarmMachine{

    //[1] : 속성(특징)
    int price;
    int year;
    String color;
     FarmMachine(){}
    public FarmMachine(int price, int year, String color) {
        this.price = price;
        this.year = year;
        this.color = color;
    }

    //[2] : 동작(기능),method
    void move(){
        System.out.println("Farm-machine is moving");
    }
    void dig(){
        System.out.println("Farm-machine is digging");
    }
    void grind(){
        System.out.println("Farm-machin is grinding");
    }


}
public class Example2 {

    public static void main(String[] args){
    //[1] : 객체 생성
       FarmMachine fm= new FarmMachine();
        System.out.println(fm);
        fm.price=20000;
        fm.year =2021;
        fm.color="red";
        String fm_price =String.format("%,d",fm.price);
        System.out.println(String.format("%,d",fm.price));
        System.out.println(fm.year);
        System.out.println(fm.color);
       fm.move();
       fm.dig();
       fm.grind();


    }
}
