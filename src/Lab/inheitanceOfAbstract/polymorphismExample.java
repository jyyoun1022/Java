package Lab.inheitanceOfAbstract;



abstract class Car{
    abstract void run();

}
class Ambulance extends  Car{
    @Override
    void run() {
        System.out.println("엠뷸런스 지나가요~ 삐뽀삐뽀");
    }
}
class Cultivator extends  Car{
    @Override
    void run() {
        System.out.println("경운기 지나가요~ 덜컹덜컹");

    }
}
class SportsCar extends  Car{
    @Override
    void run() {
        System.out.println("스포츠카 지나가요 씡~");

    }
}

public class polymorphismExample {

    public static void main(String[] args) {
        //[1] : 객체 생성
        Car c1 = new Ambulance();   //  3개 모두 정상
        Car c2 = new Cultivator();
        Car c3 = new SportsCar();

       Car[] cars = new Car[3];
        System.out.println(cars[0]);

//        cars = new Car[]{new Ambulance(),new Cultivator(), new SportsCar()};    //cars 배열 초기화
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);
        Car[] car ={new Ambulance(),new Cultivator(), new SportsCar()};
        for(int i =0; i<car.length; i++){
            car[i].run();
        }
        for(Car c : car){
            System.out.println(c);
            c.run();
        }


    }
}
