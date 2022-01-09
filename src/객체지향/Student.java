package 객체지향;

public class Student {
    public String name;
    public int money;

    public Student(){}

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void takeBus(Bus bus){
        this.money -= 1000;
        bus.take(1000);
    }
    public void takeSubway(Subway subway){
        this.money -= 1500;
        subway.take(1500);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void showInfo(){
        System.out.println(this.getName()+"의 남은돈은"+this.getMoney());
    }
}
