package JavaStandard7.Ex2;

public class Car {
    public String name;
    public int currentGear;

    public void changeGear(int gear) {
        System.out.println("기어를" + gear + "단으로 변경한다.");
        currentGear = gear;
    }

    public String get_CurrentState() {
        return name + "의 현재 기어 상태" + currentGear;
    }
}
