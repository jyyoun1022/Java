package JavaStandard6;
class Car {
    public String color;   //색상
    public String gearType; //변속기 종류 - auto(자동), manual(수동)
    public int door;    //문의 개수

    Car() {
    } //생성자

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car(Car c){//인스턴스를 위한 생성자.
        this.color=c.color;
        this.gearType=c.gearType;
        this.door=c.door;

    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c= new Car();
        c.color ="while";
        c.gearType="auto";
        c.door=4;

        Car c1 =new Car("white","auto",4);
    }
    }

