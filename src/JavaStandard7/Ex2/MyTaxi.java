package JavaStandard7.Ex2;

public class MyTaxi extends Taxi{
    @Override
    public void changeGear(int gear) {
        System.out.println("기어를 "+gear+"변경후 고정한다.");
        currentGear = gear;
    }

    public static void main(String[] args) {
        MyTaxi myT = new MyTaxi();
        myT.name="133나 4623";
        myT.currentGear=1;
        myT.fare=10000;
        myT.passenger=2;
        myT.changeGear(2);
        myT.get_CurrentState();
    }
}



