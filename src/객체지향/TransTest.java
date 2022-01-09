package 객체지향;

public class TransTest {
    public static void main(String[] args) {

        Student s1 = new Student("윤재열",20000);
        Student s2 = new Student("김태환",15000);
        Student s3 = new Student("김형욱",10000);

        Bus bus100 = new Bus(100);
        Subway num2 = new Subway("2호선");
        Subway num7 = new Subway("7호선");

        s1.takeBus(bus100); //윤재열 버스100번이용
        s1.takeSubway(num2);    //윤재열 지하철2호선이용
        s2.takeSubway(num2);    //김태환 지하철2호선이용
        s2.takeSubway(num7);    //김태환 지하철7호선이용
        s3.takeSubway(num7);    //김형욱 지하철7호선이용

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        bus100.showInfo();
        num2.showInfo();
        num7.showInfo();
    }
}
