package JavaStandard7.practice;

import JavaStandard7.practice.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        //System.out.println(t.toString());
        System.out.println(t);
        //t.hour =13; //Error!

        //현재시간보다 1시간 후로 변경한다.
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
