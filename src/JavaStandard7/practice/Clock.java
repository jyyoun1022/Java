package JavaStandard7.practice;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour>23)return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59)return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59)return;
        this.second = second;
    }
}

 interface ClockIntf{
    public int getHour();
    public void setHour(int hour);

    public int getMinute();
    public void SetMunute(int minute);

    public int getSecond();
    public void setSecond(int second);
}
